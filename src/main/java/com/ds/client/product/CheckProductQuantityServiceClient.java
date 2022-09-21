package com.ds.client.product;


import assignment.distribute.system.NameServiceClient;
import ds.inventoryManagementSystem.grpc.generated.CheckProductQuantityRequest;
import ds.inventoryManagementSystem.grpc.generated.CheckProductQuantityResponse;
import ds.inventoryManagementSystem.grpc.generated.CheckProductQuantityServiceGrpc;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.util.Scanner;

public class CheckProductQuantityServiceClient {
    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";

    private ManagedChannel channel = null;
    CheckProductQuantityServiceGrpc.CheckProductQuantityServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public CheckProductQuantityServiceClient() throws IOException, InterruptedException {
        fetchServerDetails();
    }

    private void fetchServerDetails() throws IOException, InterruptedException {
        NameServiceClient client = new NameServiceClient(NAME_SERVICE_ADDRESS);
        NameServiceClient.ServiceDetails serviceDetails = client.findService("InventoryManagementService");
        host = serviceDetails.getIPAddress();
        port = serviceDetails.getPort();
    }

    public void initializeConnection() {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        clientStub = CheckProductQuantityServiceGrpc.newBlockingStub(channel);
        channel.getState(true);
    }

    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException, IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter Product ID to check the quantity :");
        String productId = userInput.nextLine().trim();
        System.out.println("Requesting server to check the Product quantity for " + productId);
        CheckProductQuantityRequest request = CheckProductQuantityRequest
                .newBuilder()
                .setProductId(productId)
                .build();

        ConnectivityState state = channel.getState(true);
        while (state != ConnectivityState.READY) {
            System.out.println("Service unavailable, looking for a service provider..");
            fetchServerDetails();

            initializeConnection();
            Thread.sleep(5000);
            state = channel.getState(true);
        }

        CheckProductQuantityResponse response = clientStub.checkProductQuantity(request);
        System.out.printf("Product quantity " + response.getProductQuantity());
        Thread.sleep(1000);
    }
}

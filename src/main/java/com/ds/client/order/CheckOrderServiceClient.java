package com.ds.client.order;


import assignment.distribute.system.NameServiceClient;
import ds.inventoryManagementSystem.grpc.generated.CheckOrderRequest;
import ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse;
import ds.inventoryManagementSystem.grpc.generated.CheckOrderServiceGrpc;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.util.Scanner;

public class CheckOrderServiceClient {
    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";

    private ManagedChannel channel = null;
    CheckOrderServiceGrpc.CheckOrderServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public CheckOrderServiceClient() throws IOException, InterruptedException {
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
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = CheckOrderServiceGrpc.newBlockingStub(channel);
        channel.getState(true);
    }

    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException, IOException {

        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter Order Id to check :");
        String orderId = userInput.nextLine().trim();
        System.out.println("Requesting server to check the order for " + orderId);
        CheckOrderRequest request = CheckOrderRequest
                .newBuilder()
                .setOrderId(orderId)
                .build();
        ConnectivityState state = channel.getState(true);
        while (state != ConnectivityState.READY) {
            System.out.println("Service unavailable, looking for a service provider..");
            fetchServerDetails();

            initializeConnection();
            Thread.sleep(5000);
            state = channel.getState(true);
        }

        CheckOrderResponse response = clientStub.checkOrders(request);
        System.out.printf("my order is " + response.getProductName() + " - " + response.getProductQuantity());
        Thread.sleep(1000);
    }
}

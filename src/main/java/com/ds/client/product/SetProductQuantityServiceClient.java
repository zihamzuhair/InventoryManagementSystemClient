package com.ds.client.product;

import assignment.distribute.system.NameServiceClient;
import ds.inventoryManagementSystem.grpc.generated.SetProductQuantityRequest;
import ds.inventoryManagementSystem.grpc.generated.SetProductQuantityResponse;
import ds.inventoryManagementSystem.grpc.generated.SetProductQuantityServiceGrpc;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.util.Scanner;

public class SetProductQuantityServiceClient {
    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";
    private ManagedChannel channel = null;
    SetProductQuantityServiceGrpc.SetProductQuantityServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public SetProductQuantityServiceClient() throws IOException, InterruptedException {
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
        clientStub = SetProductQuantityServiceGrpc.newBlockingStub(channel);
        channel.getState(true);
    }

    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException, IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter Account ID, amount to set the balance :");
        String input[] = userInput.nextLine().trim().split(",");
        String accountId = input[0];
        double quantity = Double.parseDouble(input[1]);
        System.out.println("Requesting server to set the account balance to " + quantity + " for " + accountId.toString());
        SetProductQuantityRequest request = SetProductQuantityRequest
                .newBuilder()
                .setProductId(accountId)
                .setQuantity(quantity)
                .setIsSentByPrimary(false)
                .build();

        ConnectivityState state = channel.getState(true);
        while (state != ConnectivityState.READY) {
            System.out.println("Service unavailable, looking for a service provider..");
            fetchServerDetails();

            initializeConnection();
            Thread.sleep(5000);
            state = channel.getState(true);
        }

        SetProductQuantityResponse response = clientStub.setProductQuantity(request);
        System.out.printf("Transaction Status " + (response.getStatus() ? "Sucessfull" : "Failed"));
        Thread.sleep(1000);
    }
}

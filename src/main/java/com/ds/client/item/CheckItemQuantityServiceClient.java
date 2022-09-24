package com.ds.client.item;


import ds.inventoryManagementSystem.grpc.generated.CheckItemQuantityRequest;
import ds.inventoryManagementSystem.grpc.generated.CheckItemQuantityResponse;
import ds.inventoryManagementSystem.grpc.generated.CheckItemQuantityServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class CheckItemQuantityServiceClient {
    private ManagedChannel channel = null;
    CheckItemQuantityServiceGrpc.CheckItemQuantityServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public CheckItemQuantityServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection() {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = CheckItemQuantityServiceGrpc.newBlockingStub(channel);
    }

    public void processUserRequests() throws InterruptedException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter Product ID to check the quantity :");
        String productId = userInput.nextLine().trim();
        System.out.println("Requesting server to check the Product quantity for " + productId);
        CheckItemQuantityRequest request = CheckItemQuantityRequest
                .newBuilder()
                .setItemDescription(productId)
                .build();
        CheckItemQuantityResponse response = clientStub.checkProductQuantity(request);
        System.out.printf("Item quantity " + response.getItemQuantity());
        Thread.sleep(1000);
    }

    public void closeConnection() {
        channel.shutdown();
    }
}

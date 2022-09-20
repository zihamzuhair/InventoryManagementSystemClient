package com.ds.client.product;


import ds.inventoryManagementSystem.grpc.generated.CheckProductQuantityRequest;
import ds.inventoryManagementSystem.grpc.generated.CheckProductQuantityResponse;
import ds.inventoryManagementSystem.grpc.generated.CheckProductQuantityServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class CheckProductQuantityServiceClient {
    private ManagedChannel channel = null;
    CheckProductQuantityServiceGrpc.CheckProductQuantityServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public CheckProductQuantityServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = CheckProductQuantityServiceGrpc.newBlockingStub(channel);
    }
    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter Product ID to check the quantity :");
            String productId = userInput.nextLine().trim();
            System.out.println("Requesting server to check the Product quantity for " + productId);
            CheckProductQuantityRequest request = CheckProductQuantityRequest
                    .newBuilder()
                    .setProductId(productId)
                    .build();
            CheckProductQuantityResponse response = clientStub.checkProductQuantity(request);
            System.out.printf("Product quantity " + response.getProductQuantity());
            Thread.sleep(1000);
    }
}

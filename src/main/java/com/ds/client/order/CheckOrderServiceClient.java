package com.ds.client.order;


import ds.inventoryManagementSystem.grpc.generated.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class CheckOrderServiceClient {
    private ManagedChannel channel = null;
    CheckOrderServiceGrpc.CheckOrderServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public CheckOrderServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = CheckOrderServiceGrpc.newBlockingStub(channel);
    }
    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException {
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter Order Id to check :");
            String orderId = userInput.nextLine().trim();
            System.out.println("Requesting server to check the order for " + orderId.toString());
            CheckOrderRequest request = CheckOrderRequest
                    .newBuilder()
                    .setOrderId(orderId)
                    .build();
            CheckOrderResponse response = clientStub.checkOrders(request);
            System.out.printf("my order is " + response.getProductName() + " - " + response.getProductQuantity());
            Thread.sleep(1000);
        }
    }
}

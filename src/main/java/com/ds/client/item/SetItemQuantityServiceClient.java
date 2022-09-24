package com.ds.client.item;

import ds.inventoryManagementSystem.grpc.generated.SetItemQuantityRequest;
import ds.inventoryManagementSystem.grpc.generated.SetItemQuantityResponse;
import ds.inventoryManagementSystem.grpc.generated.SetItemQuantityServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class SetItemQuantityServiceClient {
    private ManagedChannel channel = null;
    SetItemQuantityServiceGrpc.SetItemQuantityServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public SetItemQuantityServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection() {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = SetItemQuantityServiceGrpc.newBlockingStub(channel);
    }

    public void processUserRequests() throws InterruptedException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter Item, amount to set the balance :");
        String input[] = userInput.nextLine().trim().split(",");
        String item = input[0];
        double quantity = Double.parseDouble(input[1]);
        System.out.println("Requesting server to set the item balance to " + quantity + " for " + item);
        SetItemQuantityRequest request = SetItemQuantityRequest
                .newBuilder()
                .setItemDescription(item)
                .setQuantity(quantity)
                .setIsSentByPrimary(false)
                .build();
        SetItemQuantityResponse response = clientStub.setProductQuantity(request);
        System.out.printf("Transaction Status " + (response.getStatus() ? "Successful" : "Failed"));
        Thread.sleep(1000);
    }

    public void closeConnection() {
        channel.shutdown();
    }
}

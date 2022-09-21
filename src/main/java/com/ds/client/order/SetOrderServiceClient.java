package com.ds.client.order;

import assignment.distribute.system.NameServiceClient;
import ds.inventoryManagementSystem.grpc.generated.SetOrderRequest;
import ds.inventoryManagementSystem.grpc.generated.SetOrderResponse;
import ds.inventoryManagementSystem.grpc.generated.SetOrderServiceGrpc;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.util.Scanner;

public class SetOrderServiceClient {
    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";

    private ManagedChannel channel = null;
    SetOrderServiceGrpc.SetOrderServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public SetOrderServiceClient() throws IOException, InterruptedException {
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
        clientStub = SetOrderServiceGrpc.newBlockingStub(channel);
        channel.getState(true);
    }

    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException, IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter Order Id, Product name and quantity (orderId,productName,quantity) :");
        String input[] = userInput.nextLine().trim().split(",");
        String orderId = input[0];
        String productName = input[1];
        double quantity = Double.parseDouble(input[2]);
        SetOrderRequest request = SetOrderRequest
                .newBuilder()
                .setOrderId(orderId)
                .setProductName(productName)
                .setProductQuantity(quantity)
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

        SetOrderResponse response = clientStub.setOrders(request);
        if (response.getStatus()) {
            System.out.println("Thank you for your order. your order id is " + orderId);
            System.out.printf("\nTransaction Status " + (response.getStatus() ? "Successful" : "Failed"));
        } else {
            System.out.printf("Order cancelled. Due to unavailable quantity");
            System.out.println("\nQuantity balance for " + productName + " is " + response.getRemainingQuantity());
        }

        Thread.sleep(1000);
    }
}

package com.ds.client.order;

import ds.inventoryManagementSystem.grpc.generated.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class SetOrderServiceClient {
    private ManagedChannel channel = null;
    SetOrderServiceGrpc.SetOrderServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public SetOrderServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = SetOrderServiceGrpc.newBlockingStub(channel);
    }
    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException {
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
            SetOrderResponse response = clientStub.setOrders(request);

            if(response.getStatus()){
              System.out.println("Thank you for your order. your order id is " + orderId);
              System.out.printf("\nTransaction Status " + (response.getStatus() ? "Successful" : "Failed"));
            }else{
                System.out.printf("Order cancelled. Due to unavailable quantity");
                System.out.println("\nQuantity balance for " + productName + " is "+ response.getRemainingQuantity());
            }

            Thread.sleep(1000);
    }
}

package com.ds.client.product;

import ds.inventoryManagementSystem.grpc.generated.SetProductQuantityRequest;
import ds.inventoryManagementSystem.grpc.generated.SetProductQuantityResponse;
import ds.inventoryManagementSystem.grpc.generated.SetProductQuantityServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class SetProductQuantityServiceClient {
    private ManagedChannel channel = null;
    SetProductQuantityServiceGrpc.SetProductQuantityServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public SetProductQuantityServiceClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = SetProductQuantityServiceGrpc.newBlockingStub(channel);
    }
    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException {
        while (true) {
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
            SetProductQuantityResponse response = clientStub.setProductQuantity(request);
            System.out.printf("Transaction Status " + (response.getStatus() ? "Sucessfull" : "Failed"));
            Thread.sleep(1000);
        }
    }
}

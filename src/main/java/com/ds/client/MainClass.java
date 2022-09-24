package com.ds.client;

import com.ds.client.order.CheckOrderServiceClient;
import com.ds.client.order.SetOrderServiceClient;
import com.ds.client.item.CheckItemQuantityServiceClient;
import com.ds.client.item.SetItemQuantityServiceClient;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws InterruptedException, NumberFormatException {

        String host = args[0];
        int port = Integer.parseInt(args[1].trim());

        if (args.length != 2) {
            System.out.println("Usage InventoryManagementServiceClient <host> <port>");
            System.exit(1);
        }

        while (true) {
            System.out.println("\n \nSelect your Choice : ");
            System.out.println("1. Add product");
            System.out.println("2. view product");
            System.out.println("3. Add order");
            System.out.println("4. view order");
            System.out.println("5. Exit");
            System.out.println(">>>>");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        SetItemQuantityServiceClient client3 = new SetItemQuantityServiceClient(host, port);
                        client3.initializeConnection();
                        client3.processUserRequests();
                        client3.closeConnection();
                        break;
                    case 2:
                        CheckItemQuantityServiceClient client4 = new CheckItemQuantityServiceClient(host, port);
                        client4.initializeConnection();
                        client4.processUserRequests();
                        client4.closeConnection();
                        break;
                    case 3:
                        SetOrderServiceClient client1 = new SetOrderServiceClient(host, port);
                        client1.initializeConnection();
                        client1.processUserRequests();
                        client1.closeConnection();
                        break;
                    case 4:
                        CheckOrderServiceClient client2 = new CheckOrderServiceClient(host, port);
                        client2.initializeConnection();
                        client2.processUserRequests();
                        client2.closeConnection();
                        break;
                    case 5:
                        System.out.println("Thank you!");
                        System.exit(1);
                    default:
                        System.out.println("Invalid Choice");
                }
            } catch (Exception ex) {
                System.out.println("Invalid operation");
            }
        }
    }
}
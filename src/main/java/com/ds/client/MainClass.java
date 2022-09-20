package com.ds.client;

import com.ds.client.order.CheckOrderServiceClient;
import com.ds.client.order.SetOrderServiceClient;
import com.ds.client.product.CheckProductQuantityServiceClient;
import com.ds.client.product.SetProductQuantityServiceClient;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws InterruptedException,NumberFormatException {


        String host = args[0];
        int port = Integer.parseInt(args[1].trim());
        String operation = args[2];

        if (args.length != 3) {
            System.out.println("Usage CheckBalanceServiceClient <host> <port> <s(et)|c(heck)");
            System.exit(1);
        }

        if ("sp".equals(operation)) {
            SetProductQuantityServiceClient client3 = new SetProductQuantityServiceClient(host, port);
            client3.initializeConnection();
            client3.processUserRequests();
            client3.closeConnection();
        }
        else if("vp".equals(operation)){
            CheckProductQuantityServiceClient client4 = new CheckProductQuantityServiceClient(host, port);
            client4.initializeConnection();
            client4.processUserRequests();
            client4.closeConnection();
        }else if("so".equals(operation)){
            SetOrderServiceClient client1 = new SetOrderServiceClient(host, port);
            client1.initializeConnection();
            client1.processUserRequests();
            client1.closeConnection();

        }else if("vo".equals(operation)){
            CheckOrderServiceClient client2 = new CheckOrderServiceClient(host, port);
            client2.initializeConnection();
            client2.processUserRequests();
            client2.closeConnection();
        }





//
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("\nEnter host and port (host,port):");
//        String input[] = userInput.nextLine().trim().split(",");
//        String host = input[0];
//        int port = Integer.parseInt(input[1]);

//        System.out.println("Select your Choice : ");
//        System.out.println("1. Add order");
//        System.out.println("2. view order");
//        System.out.println("3. Add product");
//        System.out.println("4. view product");
//        System.out.println(">>>>");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        switch(choice) {
//            case 1:
//                SetOrderServiceClient client1 = new SetOrderServiceClient(host, port);
//                client1.initializeConnection();
//                client1.processUserRequests();
//                client1.closeConnection();
//
//            case 2:
//                CheckOrderServiceClient client2 = new CheckOrderServiceClient(host, port);
//                client2.initializeConnection();
//                client2.processUserRequests();
//                client2.closeConnection();
//
//            case 3:
//                SetProductQuantityServiceClient client3 = new SetProductQuantityServiceClient(host, port);
//                client3.initializeConnection();
//                client3.processUserRequests();
//                client3.closeConnection();
//
//            case 4:
//                CheckProductQuantityServiceClient client4 = new CheckProductQuantityServiceClient(host, port);
//                client4.initializeConnection();
//                client4.processUserRequests();
//                client4.closeConnection();
//
//        }
    }
}

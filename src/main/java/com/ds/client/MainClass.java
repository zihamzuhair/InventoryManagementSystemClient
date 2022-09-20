package com.ds.client;

import com.ds.client.order.CheckOrderServiceClient;
import com.ds.client.order.SetOrderServiceClient;
import com.ds.client.product.CheckProductQuantityServiceClient;
import com.ds.client.product.SetProductQuantityServiceClient;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws InterruptedException, NumberFormatException {

        String host = args[0];
        int port = Integer.parseInt(args[1].trim());

        if (args.length != 2) {
            System.out.println("Usage CheckBalanceServiceClient <host> <port>");
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
                if (choice == 1) {
                    SetProductQuantityServiceClient client3 = new SetProductQuantityServiceClient(host, port);
                    client3.initializeConnection();
                    client3.processUserRequests();
                    client3.closeConnection();
                } else if (choice == 2) {
                    CheckProductQuantityServiceClient client4 = new CheckProductQuantityServiceClient(host, port);
                    client4.initializeConnection();
                    client4.processUserRequests();
                    client4.closeConnection();
                } else if (choice == 3) {
                    SetOrderServiceClient client1 = new SetOrderServiceClient(host, port);
                    client1.initializeConnection();
                    client1.processUserRequests();
                    client1.closeConnection();

                } else if (choice == 4) {
                    CheckOrderServiceClient client2 = new CheckOrderServiceClient(host, port);
                    client2.initializeConnection();
                    client2.processUserRequests();
                    client2.closeConnection();
                }else if (choice == 5){
                    System.out.println("Thank you!");
                    System.exit(1);
               }

               } catch (Exception ex) {
                    System.out.println("Invalid operation");
               }
            }
    }
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
 //   }
//}

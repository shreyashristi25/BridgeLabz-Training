package com.trafficmanager;
import java.util.* ;
public class TrafficManager {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter waiting queue capacity: ");
        int cap = sc.nextInt();
        sc.nextLine();

        //creating object of RoundaboutVehicleFlow class
        RoundaboutVehicleFlow manager = new RoundaboutVehicleFlow(cap);

        //getting user choice as input, calling methods and displaying result accordingly
        while (true) {
            System.out.println("--- TrafficManager Menu ---");
            System.out.println("1. Add Vehicle to Waiting Queue");
            System.out.println("2. Move Vehicle into Roundabout");
            System.out.println("3. Remove Vehicle from Roundabout");
            System.out.println("4. Print Roundabout State");
            System.out.println("5. Print Waiting Queue");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Vehicle Type: ");
                    String type = sc.nextLine();
                    manager.enqueueVehicle(id, type);
                    break;

                case 2:
                    manager.enterRoundabout();
                    break;

                case 3:
                    System.out.print("Enter Vehicle ID to remove: ");
                    String remId = sc.nextLine();
                    manager.exitRoundabout(remId);
                    break;

                case 4:
                    manager.printRoundabout();
                    break;

                case 5:
                    manager.printQueue();
                    break;

                case 6:
                    System.out.println("Exiting TrafficManager...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }

	}
}

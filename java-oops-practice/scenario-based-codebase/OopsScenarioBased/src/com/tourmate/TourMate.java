package com.tourmate;
import java.util.* ;
public class TourMate {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to TourMate===");

        // Taking user input for trip details 
        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter duration (days): ");
        int duration = sc.nextInt();

        // Taking user input for transport details
        System.out.print("Enter transport mode (Flight/Train/Bus): ");
        String mode = sc.nextLine();
        sc.nextLine(); 
        
        System.out.print("Enter transport cost: ");
        double transportCost = sc.nextDouble();
        Transport transport = new Transport(mode, transportCost);

        // Taking user input for transport Hotel details 
        System.out.print("Enter hotel name: ");
        sc.nextLine(); // consume newline
        String hotelName = sc.nextLine();
        System.out.print("Enter hotel cost: ");
        double hotelCost = sc.nextDouble();
        Hotel hotel = new Hotel(hotelName, hotelCost);


        // Taking user input for Activity details  
        System.out.print("Enter activity description: ");
        sc.nextLine(); 
        String activityDesc = sc.nextLine();
        
        System.out.print("Enter activity cost: ");
        double activityCost = sc.nextDouble();
        
        Activity activity = new Activity(activityDesc, activityCost);

        // Choose trip type
        System.out.print("Is this an International trip? (yes/no): ");
        sc.nextLine(); 
        String type = sc.nextLine();

        Trip trip = null;
        if (type.equalsIgnoreCase("yes")) {
            trip = new InternationalTrip(destination, duration, transport, hotel, activity);
        } 
        else if (type.equalsIgnoreCase("no") ){
            trip = new DomesticTrip(destination, duration, transport, hotel, activity);
        }
        else {
        	System.out.println("Invalid input") ;
        }

        // Taking user input and displaying results accordingly
        int choice;
        do {
            System.out.println("\n=== TourMate Menu ===");
            System.out.println("1. View Trip Details");
            System.out.println("2. Book Trip");
            System.out.println("3. Cancel Trip");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("--- Trip Details ---");
                    System.out.println("Destination: " + trip.getDestination());
                    System.out.println("Duration: " + trip.getDuration() + " days");
                    System.out.println("Budget: $" + trip.getBudget());
                    break;

                case 2:
                    trip.book();
                    break;

                case 3:
                    trip.cancel();
                    break;

                case 0:
                    System.out.println("Exiting TourMate...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        while (choice != 0);

        sc.close();
    }

}

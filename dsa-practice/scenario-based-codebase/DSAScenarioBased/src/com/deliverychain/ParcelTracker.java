package com.deliverychain;
import java.util.* ;
public class ParcelTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//creating object for DeliveryChainManagement class 
		DeliveryChainManagement tracker = new  DeliveryChainManagement();

		//taking user choice as input, processing request and displaying result 
        while (true) {
            System.out.println("--- ParcelTracker Menu ---");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Checkpoint");
            System.out.println("3. Mark Parcel Lost");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    tracker.trackParcel();
                    break;
                case 2:
                    System.out.print("Enter stage after which to add checkpoint: ");
                    String afterStage = sc.nextLine();
                    
                    System.out.print("Enter new checkpoint name: ");
                    String newStage = sc.nextLine();
                    
                    tracker.addCheckpoint(afterStage, newStage);
                    break;
                case 3:
                    System.out.print("Enter stage name where parcel is lost: ");
                    String lostStage = sc.nextLine();
                    
                    tracker.markMissing(lostStage);
                    break;
                case 4:
                    System.out.println("Exiting ParcelTracker...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

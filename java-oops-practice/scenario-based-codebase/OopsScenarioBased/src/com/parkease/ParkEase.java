package com.parkease;
import java.util.* ;

public class ParkEase {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

        // creating slots
        System.out.print("Enter number of parking slots: ");
        int nSlots = sc.nextInt();
        sc.nextLine();
        ParkingSlot[] slots = new ParkingSlot[nSlots];

        for (int i = 0; i < nSlots; i++) {
            System.out.println("Enter details for Slot " + (i+1));
            System.out.print("Slot ID: ");
            int id = sc.nextInt(); sc.nextLine();
            
            System.out.print("Location: ");
            String loc = sc.nextLine();
            
            System.out.print("Vehicle type allowed (Car/Bike/Truck): ");
            String type = sc.nextLine();
            slots[i] = new ParkingSlot(id, loc, type);
        }

        //  Registering vehicles
        System.out.print("Enter number of vehicles: ");
        int nVehicles = sc.nextInt();
        sc.nextLine();
        Vehicle[] vehicles = new Vehicle[nVehicles];

        for (int i = 0; i < nVehicles; i++) {
            System.out.println("Enter details for Vehicle " + (i+1));
            System.out.print("Vehicle Number: ");
            String num = sc.nextLine();
            
            System.out.print("Type (Car/Bike/Truck): ");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("Car")) vehicles[i] = new Car(num);
            else if (type.equalsIgnoreCase("Bike")) vehicles[i] = new Bike(num);
            else vehicles[i] = new Truck(num);
        }

        ParkingManager manager = new ParkingManager(20);

        //showing menu, getting user choice and displaying result accordingly
        int choice;
        do {
            System.out.println("-- ParkEase Menu ---");
            System.out.println("1. Book Slot");
            System.out.println("2. Release Slot");
            System.out.println("3. Show Logs");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Available Slots:");
                for (int i = 0; i < nSlots; i++) {
                    System.out.println((i+1) + ". SlotID " + slots[i].getSlotId() +" (" + slots[i].getVehicleTypeAllowed() + ") at " +
                        slots[i].getLocation() +" | Occupied: " + slots[i].isOccupied());
                }
                System.out.print("Choose slot (1-" + nSlots + "): ");
                int sChoice = sc.nextInt();

                System.out.println("\nRegistered Vehicles:");
                for (int i = 0; i < nVehicles; i++) {
                    System.out.println((i+1) + ". " + vehicles[i].getVehicleNumber() +" (" + vehicles[i].getVehicleType() + ")");
                }
                System.out.print("Choose vehicle (1-" + nVehicles + "): ");
                int vChoice = sc.nextInt();

                System.out.print("Enter duration (hours): ");
                int hrs = sc.nextInt();

                manager.bookSlot(slots[sChoice-1], vehicles[vChoice-1], hrs);
                break;

            case 2:
                System.out.print("Enter slot index to release (1-" + nSlots + "): ");
                int rel = sc.nextInt();
                manager.releaseSlot(slots[rel-1]);
                break;

            case 3:
                manager.printLogs();
                break;
        }
    } 
        while (choice != 4);

        sc.close();


	}

}

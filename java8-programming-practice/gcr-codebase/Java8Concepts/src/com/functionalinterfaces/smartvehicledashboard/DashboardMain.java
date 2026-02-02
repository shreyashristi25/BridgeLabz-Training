package com.functionalinterfaces.smartvehicledashboard;
import java.util.* ;

public class DashboardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking user choice as input and displaying result accordingly
        System.out.println("Choose vehicle type:");
        System.out.println("1. Regular Car");
        System.out.println("2. Electric Car");
        System.out.println("Enter your choice  : ") ;
        
        int choice = sc.nextInt();
        VehicleDashboard vehicle;

        if (choice == 1) {
            vehicle = new Car();
            System.out.print("Enter speed (km/h): ");
            int speed = sc.nextInt();
            vehicle.displaySpeed(speed);
            int battery = 0 ;
            vehicle.displayBattery(battery);

        } 
        else if (choice == 2) {
            vehicle = new ElectricCar();
            
            System.out.print("Enter speed (km/h): ");
            int speed = sc.nextInt();
            vehicle.displaySpeed(speed);

            System.out.print("Enter battery percentage: ");
            int battery = sc.nextInt();
            vehicle.displayBattery(battery);

        }
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        
        sc.close();


	}

}

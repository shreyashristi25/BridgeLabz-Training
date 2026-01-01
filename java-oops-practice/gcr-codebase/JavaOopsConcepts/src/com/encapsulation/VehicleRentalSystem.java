package com.encapsulation;

public class VehicleRentalSystem {

	public static void main(String[] args) {
		
		// Array of vehicles 
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("C101", 1000, "CAR123456");
        vehicles[1] = new Bike("B202", 500, "BIKE98765");
        vehicles[2] = new Truck("T303", 2000, "TRUCK54321");

        int days = 5;

        // Polymorphism: iterate and calculate
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.type + " (" + v.vehicleNumber + ")");
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));

            
            Insurable ins = (Insurable) v;
            System.out.println("Insurance Cost: " + ins.calculateInsurance());
            System.out.println(ins.getInsuranceDetails());
            System.out.println("-----------------------------------");
        }


	}

}

package com.encapsulation;

//driver class for Ride Hailing Application
public class RideHailingApplication {

		//method to process fares
	    public static void processFare(Vehicles v, double distance) {
	        System.out.println(v.getVehicleDetails());
	        System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
	        System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
	        System.out.println("-----------------------------------");
	    }

	    public static void main(String[] args) {
	        // Array of vehicles (no collections)
	        Vehicles[] vehicles = new Vehicles[3];
	        vehicles[0] = new Cars("CAR12345", "Alice", 15, "Downtown");
	        vehicles[1] = new Bikes("BIKE67890", "Bob", 10, "City Center");
	        vehicles[2] = new Auto("AUTO54321", "Charlie", 12, "Railway Station");

	        double distance = 10; 

	        // process each vehicle dynamically
	        for (Vehicles v : vehicles) {
	            processFare(v, distance);
	        }


	}

}

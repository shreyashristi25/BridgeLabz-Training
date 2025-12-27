package com.constructor.level1;

public class VehicleMain {

	//creating the driver class for Vehicle class
	public static void main(String[] args) {
	
		Vehicle v1 = new Vehicle("Arun", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1000.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();


	}

}

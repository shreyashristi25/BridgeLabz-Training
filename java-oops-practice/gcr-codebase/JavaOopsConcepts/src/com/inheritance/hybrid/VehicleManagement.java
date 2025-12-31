package com.inheritance.hybrid;

public class VehicleManagement {

	public static void main(String[] args) {

		// Electric Vehicle
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        ev.displayInfo();
        ev.charge();
        System.out.println("-------------------");

        // Petrol Vehicle
        PetrolVehicle pv = new PetrolVehicle(180, "Honda Civic", 50);
        pv.displayInfo();
        pv.refuel();

	}

}

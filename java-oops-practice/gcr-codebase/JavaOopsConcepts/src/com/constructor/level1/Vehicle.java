package com.constructor.level1;

public class Vehicle {

	String ownerName;
    String vehicleType;

    // Class variable 
    private static double registrationFee = 500.0; 

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName +", Vehicle Type: " + vehicleType +", Registration Fee: " + registrationFee);
    }

    // Class method 
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

}

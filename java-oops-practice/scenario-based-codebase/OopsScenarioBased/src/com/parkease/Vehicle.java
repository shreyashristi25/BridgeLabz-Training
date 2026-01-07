package com.parkease;

public abstract class Vehicle implements IPayable{

	//private variables to ensure limited access
	private String vehicleNumber;
    private String vehicleType;

    //constructor
    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    //getter methods to get vehicle number and vehicle type
    public String getVehicleNumber() { 
    	return vehicleNumber;
    }
    public String getVehicleType() {
    	return vehicleType; 
    }

}

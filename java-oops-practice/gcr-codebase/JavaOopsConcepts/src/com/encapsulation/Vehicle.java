package com.encapsulation;

public abstract class Vehicle {

	//protected variables
	protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    //constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //Abstract method
    public abstract double calculateRentalCost(int days);

}

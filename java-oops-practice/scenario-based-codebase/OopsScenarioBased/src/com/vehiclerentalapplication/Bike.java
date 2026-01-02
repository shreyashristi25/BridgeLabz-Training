package com.vehiclerentalapplication;

//creating bike class as subclass of Vehicle and Rentable
public class Bike extends Vehicle implements Rentable{

	//constructor
	public Bike(int id, String brand, double baseRate) {
        super(id, brand, baseRate);
    }

	//overriden method of vehicle 
    @Override
    public double calculateRent(int days) {
        return baseRate * days; 
    }
}

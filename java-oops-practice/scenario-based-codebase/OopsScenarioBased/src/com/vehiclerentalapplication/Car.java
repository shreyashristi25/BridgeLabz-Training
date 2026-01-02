package com.vehiclerentalapplication;

//creating class Car as a subclass of Vehicle and Rentable
public class Car extends Vehicle implements Rentable{

	private boolean luxury;
	
	//constructor
	public Car(int id, String brand, double baseRate, boolean luxury) {
        super(id, brand, baseRate);
    }

	//overriden method of Vehicle
    @Override
    public double calculateRent(int days) {
    	double surcharge = luxury ? 500 : 200; 
        return (baseRate * days) + surcharge;

    }

}

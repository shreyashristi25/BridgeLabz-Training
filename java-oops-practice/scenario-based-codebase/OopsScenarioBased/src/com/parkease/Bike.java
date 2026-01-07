package com.parkease;

//Creating Bike as subclass of Vehicle class 
public class Bike extends Vehicle{

	//constructor
	public Bike(String number) {
		super(number, "Bike"); 
	}

    @Override
    public double calculateCharges(int durationHours) {
        double baseRate = 20;
        double penalty = (durationHours > 3) ? 50 : 0;
        return baseRate * durationHours + penalty;
    }

}

package com.parkease;

//creating Car as subclass of Vehicle
public class Car extends Vehicle{

	//constructor
	public Car(String number) { 
		super(number, "Car"); 
	}

    @Override
    public double calculateCharges(int durationHours) {
        double baseRate = 50;
        double penalty = (durationHours > 5) ? 100 : 0;
        return baseRate * durationHours + penalty;
    }

}

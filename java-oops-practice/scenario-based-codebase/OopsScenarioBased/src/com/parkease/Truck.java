package com.parkease;

//Creating Truck as subclass of Vehicle class
public class Truck extends Vehicle{

	//constructor
	public Truck(String number) {
		super(number, "Truck"); 
	}

    @Override
    public double calculateCharges(int durationHours) {
        double baseRate = 100;
        double penalty = (durationHours > 8) ? 200 : 0;
        return baseRate * durationHours + penalty;
    }

}

package com.inheritance;

//creating car class as subclass of Vehicle class
public class Car extends Vehicle{
	
	int seatCapacity;

	//constructor
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Car -> Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType +
                           ", Seats: " + seatCapacity);
    }

}

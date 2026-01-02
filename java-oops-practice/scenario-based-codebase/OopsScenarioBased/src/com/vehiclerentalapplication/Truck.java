package com.vehiclerentalapplication;

//creating Truck as a subclass of Vehicle and Rentable 
public class Truck extends Vehicle implements Rentable{

	private double loadCapacity ;
	
	//constructor
	public Truck(int id, String brand, double baseRate, double loadCapacity) {
        super(id, brand, baseRate);
        this.loadCapacity = loadCapacity;

    }

	//overriden method of Vehicle class
    @Override
    public double calculateRent(int days) {
    double surcharge = loadCapacity > 1000 ? 1000 : 500;
    return (baseRate * days) + surcharge;
        }

}

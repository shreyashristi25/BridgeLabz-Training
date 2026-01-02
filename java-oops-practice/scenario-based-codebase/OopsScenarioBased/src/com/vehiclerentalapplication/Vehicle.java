package com.vehiclerentalapplication;

public abstract class Vehicle implements Rentable{

	protected int id;
    protected String brand;
    protected double baseRate;

    //constructor
    public Vehicle(int id, String brand, double baseRate) {
        this.id = id;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    //getters and setters to get id, brand and base rate and set base rate
    public int getId() {
    	return id; 
    }
    public String getBrand() { 
    	return brand;
    }
    public double getBaseRate() {
    	return baseRate; 
    }

    public void setBaseRate(double baseRate) { 
    	this.baseRate = baseRate; 
    }

    //method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle ID: " + id + " | Brand: " + brand + " | Base Rate: " + baseRate);
    }

}

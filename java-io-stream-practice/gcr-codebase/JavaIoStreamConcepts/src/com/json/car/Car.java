package com.json.car;

public class Car {

	private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters to get brand, model and year of car
    public String getBrand() { 
    	return brand; 
    }
    public String getModel() { 
    	return model; 
    }
    public int getYear() { 
    	return year; 
    }

}

package com.inheritance.hybrid;

public class Vehicle {

	int maxSpeed;
    String model;

    //constructor
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    //method to display Vehicle info
    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }

}

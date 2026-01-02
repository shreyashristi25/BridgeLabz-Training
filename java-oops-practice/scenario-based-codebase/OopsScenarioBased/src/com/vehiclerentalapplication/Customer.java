package com.vehiclerentalapplication;

public class Customer {

	private int id;
    private String name;
    private String licenseNumber;

    //constructor
    public Customer(int id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    //method to display customer's information 
    public void displayInfo() {
        System.out.println("Customer ID: " + id + " | Name: " + name + " | License: " + licenseNumber);
    }

}

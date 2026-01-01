package com.encapsulation;

//creating class car as a subclass of Vehicle and Insurable
public class Car extends Vehicle implements Insurable {

	private String policyNumber; 

	//constructor
    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    //overridden methods from insuarble and vehicle
    @Override
    public double calculateRentalCost(int days) {
        return days * rentalRate;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.1; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        return " " + policyNumber.substring(policyNumber.length() - 4);
    }

}

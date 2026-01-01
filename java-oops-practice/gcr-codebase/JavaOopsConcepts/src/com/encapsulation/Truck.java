package com.encapsulation;

//creating truck as a subclass of vehicle and insurable
public class Truck extends Vehicle implements Insurable{

	private String policyNumber;

	//constructor
	
    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalRate * 1.5; 
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.2; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        return " " + policyNumber.substring(policyNumber.length() - 4);
    }

}

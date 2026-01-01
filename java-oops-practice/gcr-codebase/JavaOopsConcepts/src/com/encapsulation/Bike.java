package com.encapsulation;

//creating class bike as a subclass of vehicle and insurable
public class Bike extends Vehicle implements Insurable{

	private String policyNumber;

	//constructor
    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalRate * 0.8; // 20% discount
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05; // 5% of rentalRate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + maskPolicyNumber();
    }

    private String maskPolicyNumber() {
        return " " + policyNumber.substring(policyNumber.length() - 4);
    }

}

package com.constructor.level1;

public class CarRental {
	String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;
 

	public CarRental() {
    this.customerName = "Meera";
    this.carModel = "Standard";
    this.rentalDays = 1;
    this.dailyRate = 1000.0; 
	}

	// Parameterized constructor
	public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
    this.customerName = customerName;
    this.carModel = carModel;
    this.rentalDays = rentalDays;
    this.dailyRate = dailyRate;
	}

	// Methods to calculate total cost and display the result
	public double calculateTotalCost() {
		return rentalDays * dailyRate;
	}

	public void displayRental() {
		System.out.println("Customer: " + customerName +", Car Model: " + carModel +", Rental Days: " + rentalDays +
         ", Daily Rate: " + dailyRate +", Total Cost: " + calculateTotalCost());
	}
}

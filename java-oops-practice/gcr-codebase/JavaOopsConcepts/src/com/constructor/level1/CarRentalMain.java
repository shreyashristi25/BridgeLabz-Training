package com.constructor.level1;

public class CarRentalMain {
	
	public static void main(String[] args) {
        
        CarRental rental1 = new CarRental();

        CarRental rental2 = new CarRental("Shruti", "SUV", 5, 1500.0);

        rental1.displayRental();
        rental2.displayRental();
    }

}

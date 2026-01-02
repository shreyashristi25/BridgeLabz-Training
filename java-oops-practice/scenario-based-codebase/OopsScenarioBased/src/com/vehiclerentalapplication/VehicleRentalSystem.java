package com.vehiclerentalapplication;

public class VehicleRentalSystem {

	public static void main(String[] args) {

		//creating objects 
		Customer c1 = new Customer(1, "Shruti", "MP12345");

        Vehicle bike = new Bike(101, "Hero", 200);
        Vehicle car = new Car(102, "Honda", 1000, true);
        Vehicle truck = new Truck(103, "Tata", 1500, 1200);

        //accessing methods and displaying info
        c1.displayInfo();
        bike.displayInfo();
        System.out.println("Bike Rent (for 5 days): " + bike.calculateRent(5));

        car.displayInfo();
        System.out.println("Car Rent (for 3 days): " + car.calculateRent(3));

        truck.displayInfo();
        System.out.println("Truck Rent (for 2 days): " + truck.calculateRent(2));


	}

}

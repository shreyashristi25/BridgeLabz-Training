package com.functionalinterfaces.multivehiclerentalsystem;

public class Bike implements Rentable {

	@Override
	public void rent () {
		System.out.println("Bike Rented!") ;
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bike Returned!") ;
	}
}

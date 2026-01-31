package com.functionalinterfaces.multivehiclerentalsystem;

public class Car implements Rentable{

	@Override
	public void rent() {
		System.out.println("Car Rented!") ;
	}
	
	@Override 
	public void returnVehicle() {
		System.out.println("Car Returned!") ;
	}
	
	
}

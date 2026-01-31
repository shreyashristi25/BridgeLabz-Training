package com.functionalinterfaces.multivehiclerentalsystem;

public class Bus implements Rentable{

	@Override
	public void rent() {
		System.out.println("Bus Rented!") ;
	}
	
	@Override
	public void returnVehicle() {
		System.out.println("Bus Returned!") ;
	}
}

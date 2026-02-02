package com.functionalinterfaces.smartvehicledashboard;

public class Car implements VehicleDashboard{

	@Override
	public void displaySpeed(int speed) {
		System.out.println("Car speed : " +speed +"km/hr") ;
	}
	
}

package com.functionalinterfaces.smartvehicledashboard;

public class ElectricCar implements VehicleDashboard{

	@Override
	public void displaySpeed(int speed) {
		System.out.println("Electric Car speed: " + speed + " km/h");

	}
	
	@Override
	public void displayBattery(int percent) {
		System.out.println("Battery level : " +percent +"%") ;
	}
}

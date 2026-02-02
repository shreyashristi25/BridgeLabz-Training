package com.functionalinterfaces.smartvehicledashboard;

public interface VehicleDashboard {

	//display method to display speed 
	void displaySpeed(int speed) ;
	
	//default method to display battery percent
	default void displayBattery(int  percent) {
		System.out.println("Battery info is not availabe.") ;
	}
}

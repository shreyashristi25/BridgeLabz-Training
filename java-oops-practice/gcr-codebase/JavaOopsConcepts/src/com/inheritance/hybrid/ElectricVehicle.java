package com.inheritance.hybrid;

//creating ElectricVehicle as subclass for Vehicle class
public class ElectricVehicle extends Vehicle{
	
	 int batteryCapacity; 

	 //constructor
	    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
	        super(maxSpeed, model);
	        this.batteryCapacity = batteryCapacity;
	    }

	    //method to display charging status
	    void charge() {
	        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh");
	    }

	    @Override
	    void displayInfo() {
	        super.displayInfo();
	        System.out.println("Type: Electric Vehicle, Battery Capacity: " + batteryCapacity + " kWh");
	    }

}

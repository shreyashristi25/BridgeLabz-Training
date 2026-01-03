package com.cabbygo;

public class Vehicle {

	private int vehicleNumber;
	protected int capacity ;
	protected String type ;
	
	public Vehicle(int vehicleNumber, int capacity, String type) {
		
		this.vehicleNumber =  vehicleNumber ;
		this.capacity = capacity ;
		this.type = type ;
	}
	
	public int getVehicleNumber() {
		return vehicleNumber ;
	}
	public int getCapacity() {
		return capacity ;
	}
	public String getType() {
		return type ;
	}
	
	public void displayInfo() {
		System.out.println("Vehicle Number :" +vehicleNumber +"| Vehicle Capacity :" +capacity +" | Type " +type) ;
	}
}

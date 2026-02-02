package com.functionalinterfaces.cloningprototypeobjects;

public class Vehicle implements Cloneable{

	private String model ;
	private int speed ;
	
	public Vehicle(String model , int speed) {
		this.model = model ;
		this.speed = speed ;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone() ;
	}
	
	@Override 
	public String toString() {
		return "Vehicle -> model : " +model +" | speed : " +speed ;
	}
	
}

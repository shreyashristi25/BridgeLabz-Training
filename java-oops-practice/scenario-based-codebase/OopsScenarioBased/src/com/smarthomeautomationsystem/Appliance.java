package com.smarthomeautomationsystem;

//creating abstract class appliance that implements Controllable
public abstract class Appliance implements Controllable{

	    private int id;
	    private String name;
	    private double powerUsage; 
	    private boolean isOn;

	    //constructor
	    public Appliance(int id, String name, double powerUsage) {
	        this.id = id;
	        this.name = name;
	        this.powerUsage = powerUsage;
	        this.isOn = false;
	    }

	    //getter method to get power usage
	    public double getPowerUsage() {
	    	return powerUsage; 
	    }
	    
	    //methods for appliance status(On/Off)
	    public boolean isOn() { 
	    	return isOn;
	    }

	    protected void setOn(boolean state) { this.isOn = state; }

	    //method to display appliance info
	    public void displayInfo() {
	        System.out.println("Appliance: " + name + 
	                           " | Power Usage: " + powerUsage + "W" +
	                           " | Status: " + (isOn ? "ON" : "OFF"));
	    }

}

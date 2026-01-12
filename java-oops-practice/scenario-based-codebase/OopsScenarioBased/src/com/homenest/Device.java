package com.homenest;

public abstract class Device implements IControllable {

	//private and protected variables to ensure limited access
	protected int deviceId ;
	private String status ;
	protected double energyUsage ;
	protected  String firmwarelogs ;
	
	//constructor
	public Device(int id, double usage) {
		this.deviceId = id;        
	    this.status = "OFF";
	    this.energyUsage = usage;  
	    System.out.println("Device " + deviceId + " registered.");
	}

	
	//getter methods to get status, energy usage, add new energy , subtract energy and get device id
    public String getStatus() {
        return status;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    public double addEnergy(Device other) {
        return this.energyUsage + other.energyUsage;
    }

    public double subtractEnergy(Device other) {
        return this.energyUsage - other.energyUsage;
    }
    
    public int getId() {
        return deviceId;
    }

    @Override
    public void turnOn() {
        status = "ON";
        System.out.println("Device " + deviceId + " turned ON.");
    }

    @Override
    public void turnOff() {
        status = "OFF";
        System.out.println("Device " + deviceId + " turned OFF.");
    }

    // Abstract reset 
    @Override
    public abstract void reset();
}

	


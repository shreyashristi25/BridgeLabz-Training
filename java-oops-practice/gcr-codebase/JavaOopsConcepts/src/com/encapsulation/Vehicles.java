package com.encapsulation;

public abstract class Vehicles {

	//private and protected variables 
	private String vehicleId;
    private String driverName;
    protected double ratePerKm;
    private String currentLocation;

    //constructor
    public Vehicles(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    //getter and setter methods
    public String getVehicleId() {
        return " " + vehicleId.substring(vehicleId.length() - 4);
    }

    public String getDriverName() {
        return driverName;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + getVehicleId() + ", Driver: " + driverName + ", Rate/km: " + ratePerKm;
    }

    //abstract method
    public abstract double calculateFare(double distance);

}

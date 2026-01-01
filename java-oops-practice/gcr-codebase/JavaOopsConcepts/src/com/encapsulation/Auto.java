package com.encapsulation;

//creating auto as a subclass of vehicles and GPS
public class Auto extends Vehicles implements GPS{

	private double baseCharge = 30; 

	//constructor
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    //overriden methods of Vehicles class
    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) + baseCharge;
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        super.setCurrentLocation(newLocation);
    }

}

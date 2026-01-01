package com.encapsulation;

//creating bikes as a subclass of vehicles and GPS
public class Bikes extends Vehicles implements GPS{

	//constructor
	public Bikes(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

	 //overriden methods of Vehicles class
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.8; // discounted
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

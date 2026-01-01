package com.encapsulation;

//creating Cars as a subclass of vehicles and GPS
public class Cars extends Vehicles implements GPS{

	//constructor
	public Cars(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

	 //overriden methods of Vehicles class
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
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

package com.cabbygo;

public class RideServices implements IRideService{

	private Vehicle vehicle;
    private Driver driver;
    private double fare;       
    private String location;   

    @Override
    public void bookRide(Vehicle vehicle, Driver driver, double distance) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.location = "Pickup Location Hidden"; 

        // Fare calculation: baseFare + distance * rate
        double baseFare = 50;  // fixed base fare
        double rate = (vehicle instanceof SUV) ? 15 : 
                      (vehicle instanceof Sedan) ? 12 : 10;

        this.fare = baseFare + distance * rate;

        System.out.println("Ride booked with " + driver.getName() +
                           " in a " + vehicle.getType() +
                           ". Estimated fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended. Final fare: ₹" + fare);
        this.vehicle = null;
        this.driver = null;
        this.fare = 0;
        this.location = null;
    }

	
	
}

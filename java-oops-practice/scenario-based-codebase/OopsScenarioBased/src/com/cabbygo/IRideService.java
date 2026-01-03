package com.cabbygo;

public interface IRideService {

	public void bookRide(Vehicle vehicle, Driver driver, double distance) ;
	public void endRide() ;
}

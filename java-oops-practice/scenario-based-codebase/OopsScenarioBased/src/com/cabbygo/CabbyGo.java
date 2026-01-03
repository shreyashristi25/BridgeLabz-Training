package com.cabbygo;

public class CabbyGo {

	public static void main(String[] args) {


		Vehicle v1 = new Sedan (101) ;
		Driver d1 = new Driver ("Aryan", "MP2314", 4.8) ;
		
		IRideService rideServices =  new RideServices() ;
		rideServices.bookRide(v1, d1, 10.2) ;
		rideServices.endRide();

	}

}

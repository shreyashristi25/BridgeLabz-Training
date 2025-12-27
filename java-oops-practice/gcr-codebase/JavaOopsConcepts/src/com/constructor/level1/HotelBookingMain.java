package com.constructor.level1;

public class HotelBookingMain {

	 public static void main(String[] args) {
	        
	        HotelBooking booking1 = new HotelBooking();
	        
	        HotelBooking booking2 = new HotelBooking("Abc", "Deluxe", 3);
	        
	        HotelBooking booking3 = new HotelBooking(booking2);

	        System.out.println("Default Booking:");
	        booking1.displayBooking();

	        System.out.println("Custom Booking:");
	        booking2.displayBooking();

	        System.out.println("Copied Booking:");
	        booking3.displayBooking();
	    }

}

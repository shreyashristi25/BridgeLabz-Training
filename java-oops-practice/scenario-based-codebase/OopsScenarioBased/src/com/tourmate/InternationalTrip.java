package com.tourmate;

//creating InternationalTrip as a subclass of Trip
public class InternationalTrip extends Trip{

	//constructor
	public InternationalTrip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Booking International Trip to " + getDestination() +" for " + getDuration() + " days. Budget: $" + getBudget());
        transport.book();
        hotel.book();
        activity.book();
        System.out.println("Passport & Visa check required.");
    }

}

package com.tourmate;

//creating DomesticTrip as a subclass of Trip class
public class DomesticTrip extends Trip{

	//constructor
	public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Booking Domestic Trip to " + getDestination() +" for " + getDuration() + " days. Budget: $" + getBudget());
        
        transport.book();
        hotel.book();
        activity.book();
        System.out.println("No passport required, enjoy your local adventure!");
    }

}

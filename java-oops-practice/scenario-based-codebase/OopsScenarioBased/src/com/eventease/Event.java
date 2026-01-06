package com.eventease;
import java.util.* ;
import java.time.LocalDate ;

public abstract class Event implements ISchedulable{

		//private variables to ensure limited access
	 	private final int eventId; 
	    private String eventName;
	    private String location;
	    private String date;
	    private int attendees;
	    private double venueCost;
	    private double serviceCost;
	    private double discount;

	    // Constructor without packages
	    public Event(int eventId, String eventName, String location, String date, int attendees, double venueCost) {
	        this.eventId = eventId;
	        this.eventName = eventName;
	        this.location = location;
	        this.date = date;
	        this.attendees = attendees;
	        this.venueCost = venueCost;
	        this.serviceCost = 0;
	        this.discount = 0;
	    }

	    // Constructor with catering/decoration packages
	    public Event(int eventId, String eventName, String location, String date, int attendees,
	                 double venueCost, double serviceCost, double discount) {
	        this(eventId, eventName, location, date, attendees, venueCost);
	        this.serviceCost = serviceCost;
	        this.discount = discount;
	    }

	    // Getters
	    public int getEventId() { 
	    	return eventId; 
	    }
	    public String getEventName() { 
	    	return eventName; 
	    }
	    public String getLocation() { 
	    	return location; 
	    }
	    public String getDate() {
	    	return date; 
	    }
	    public int getAttendees() { 
	    	return attendees; 
	    }

	    // Operator-like method to calculate cost
	    public double calculateCost() {
	        return venueCost + serviceCost - discount;
	    }

	    // Abstract methods for polymorphism
	    public abstract void schedule();

	    @Override
	    public void reschedule(String newDate) {
	        this.date = newDate;
	        System.out.println(eventName + " has been rescheduled to " + newDate);
	    }

	    @Override
	    public void cancel() {
	        System.out.println(eventName + " has been cancelled.");
	    }

}

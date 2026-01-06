package com.eventease;

public class BirthdayEvent extends Event{

	public BirthdayEvent(int eventId, String eventName, String location, String date, int attendees,
            double venueCost, double serviceCost, double discount) {
super(eventId, eventName, location, date, attendees, venueCost, serviceCost, discount);
}

@Override
public void schedule() {
System.out.println("Birthday Event '" + getEventName() + "' scheduled at " + getLocation() +
              " on " + getDate() + " with " + getAttendees() + " attendees.");
}

}

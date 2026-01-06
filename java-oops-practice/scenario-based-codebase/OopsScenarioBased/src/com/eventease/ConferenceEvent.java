package com.eventease;

public class ConferenceEvent extends Event{

	public ConferenceEvent(int eventId, String eventName, String location, String date, int attendees,
            double venueCost, double serviceCost, double discount) {
			super(eventId, eventName, location, date, attendees, venueCost, serviceCost, discount);
	}

	@Override
	public void schedule() {
		System.out.println("Conference Event '" + getEventName() + "' scheduled at " + getLocation() +
		" on " + getDate() + " for " + getAttendees() + " participants.");
	}
}

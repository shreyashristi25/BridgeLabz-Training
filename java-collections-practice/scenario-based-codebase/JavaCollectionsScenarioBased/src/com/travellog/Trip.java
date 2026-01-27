package com.travellog;
import java.io.* ;
import java.time.* ;

public class Trip implements Serializable {

	//private variables to ensure limited access
	private String city;
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;

    //constructor
    public Trip(String city, String country, LocalDate startDate, LocalDate endDate) {
        this.city = city;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //getter methods to get city, country, start date and end date and duartion of the trip
    public String getCity() { 
    	return city;
    }
    public String getCountry() { 
    	return country; 
    }
    public LocalDate getStartDate() {
    	return startDate; 
    }
    public LocalDate getEndDate() { 
    	return endDate; 
    }

    public long getDuration() {
        return java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate) + 1;
    }

    @Override
    public String toString() {
        return city + ", " + country + " (" + startDate + " to " + endDate + ")";
    }


}

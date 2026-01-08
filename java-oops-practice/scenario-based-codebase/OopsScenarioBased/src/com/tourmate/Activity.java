package com.tourmate;

public class Activity implements IBookable{

	//private variables to ensure limited access
	private String description;
    private double cost;

    //constructor
    public Activity(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    //method to get cost
    public double getCost() {
    	return cost; 
    }

    @Override
    public void book() {
        System.out.println("Activity booked: " + description);
    }

    @Override
    public void cancel() {
        System.out.println("Activity cancelled: " + description);
    }

}

package com.tourmate;

public class Hotel implements IBookable{

	//private variables to ensure limited access
	private String name;
    private double cost;

    //constructor
    public Hotel(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    //method to get cost
    public double getCost() { 
    	return cost; 
    }

    @Override
    public void book() {
        System.out.println("Hotel " + name + " booked.");
    }

    @Override
    public void cancel() {
        System.out.println("Hotel booking cancelled.");
    }

}

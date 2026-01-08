package com.tourmate;

//creating Transport class that implements IBookable interface
public class Transport implements IBookable{

	//private variables to ensure limited access
	private String mode;   
    private double cost;

    //constructor
    public Transport(String mode, double cost) {
        this.mode = mode;
        this.cost = cost;
    }

    //method to get cost
    public double getCost() {
    	return cost; 
    }

    @Override
    public void book() {
        System.out.println("Transport booked via " + mode);
    }

    @Override
    public void cancel() {
        System.out.println("Transport booking cancelled.");
    }

}

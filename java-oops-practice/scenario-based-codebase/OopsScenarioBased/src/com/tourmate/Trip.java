package com.tourmate;

public abstract class Trip implements IBookable{

	//private and protected variables to ensure limited access
	private String destination;
    private double budget;
    private int duration; 

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    //constructor
    public Trip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;
        this.budget = calculateTotalBudget(); // operator-like aggregation
    }

    // method to calculate  total budget, book and cancel 
    private double calculateTotalBudget() {
        return transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public double getBudget() { return budget; }
    public String getDestination() { return destination; }
    public int getDuration() { return duration; }

    // Abstract method
    public abstract void book();

    @Override
    public void cancel() {
        System.out.println("Trip to " + destination + " cancelled.");
        transport.cancel();
        hotel.cancel();
        activity.cancel();
    }
}

	
	
	


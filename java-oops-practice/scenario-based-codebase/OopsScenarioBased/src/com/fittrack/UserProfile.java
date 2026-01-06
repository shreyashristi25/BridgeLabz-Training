package com.fittrack;

public class UserProfile {

	//protected and private variables to ensure limited access
	protected String name ;
	protected int age ;
	private double weight ;
	protected String goal ;
	private double dailyTarget ;
	
	//constructor
	public UserProfile (String name, int age, double weight, String goal, double dailyTarget) {
		this.name = name ;
		this.age = age ;
		this.weight = weight ;
		this.goal = goal ;
		this.dailyTarget = dailyTarget;

	}
	
	//getters for getting weight and daily target
	public double getWeight() { 
		return weight; 
	}
    public double getDailyTarget() {
    	return dailyTarget; 
    }

    //methods to show profile and compute progress
    public void showProfile() {
        System.out.println("--- User Profile ---");
        System.out.println("Name: " + name + ", Age: " + age + ", Goal: " + goal);
        System.out.println("Daily Calorie Target: " + dailyTarget);
    }

    public double computeProgress(double caloriesBurned) {
        return dailyTarget - caloriesBurned;
    }


}

package com.generics.mealplangenerator;

public class Meal<T extends MealPlan> {

	//private variables to ensure limited access
	private String userName ;
	private T mealPlan ;
	
	//constructor
	public Meal(String userName, T mealPlan) {
		this.userName = userName ;
		this.mealPlan = mealPlan ;
	}
	
	//getter methods to get user name and meal plan
	public String getUserName() {
		return userName ;
		
	}
	
	public T getMealPlan() {
		return mealPlan ;
	}
	
	//method to display user and its deit
	public void showMealPlan() {
		System.out.println("Meal Plan for " +userName + " : " +mealPlan.getDescription()) ;
	}
}

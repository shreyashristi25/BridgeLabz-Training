package com.fittrack;

//creating CardioWorkout as subclass of Workout class
public class CardioWorkout extends Workout{

	//constructor
	public CardioWorkout(int duration) { 
		super("Cardio", duration);
	}

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 8; 
        addLog("Cardio calories calculated: " + caloriesBurned);
    }

}

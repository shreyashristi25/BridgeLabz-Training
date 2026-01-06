package com.fittrack;

//creating StrengthWorkout as subclass of Workout
public class StrengthWorkout extends Workout {

	//constructor
	public StrengthWorkout(int duration) { 
		super("Strength", duration); 
	}

    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 6; 
        addLog("Strength calories calculated: " + caloriesBurned);
    }

}

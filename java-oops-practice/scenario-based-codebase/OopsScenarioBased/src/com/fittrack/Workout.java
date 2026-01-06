package com.fittrack;

//creating Workout class that implements ITrackable interface
public abstract class Workout implements ITrackable{

	protected String type;
    protected int duration;
    protected double caloriesBurned;

    // creating array for logs
    private String [] workoutLog = new String[10];
    private int logCount = 0;

    //constructor
    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = 0;
    }

    @Override
    public void startWorkout() {
        addLog("Started " + type + " workout for " + duration + " minutes.");
        System.out.println("Workout started: " + type);
    }

    @Override
    public void stopWorkout() {
        addLog("Stopped " + type + " workout.");
        System.out.println("Workout stopped: " + type);
    }

    public abstract void calculateCalories();


    //methods to add logs, show Logs, get calories burned
    protected void addLog(String entry) {
        if (logCount < workoutLog.length) {
            workoutLog[logCount++] = entry;
        }
    }

    public void showLogs() {
        System.out.println("--- Workout Logs ---");
        for (int i = 0; i < logCount; i++) {
            System.out.println(workoutLog[i]);
        }
    }

    public double getCaloriesBurned() { 
    	return caloriesBurned; 
    }

}

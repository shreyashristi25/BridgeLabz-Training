package com.petpal;
import java.util.* ;
public abstract class Pet implements IInteractable{

	//private variables to ensure limited access
	private String name ;
	private String type ;
	private int age ;
	private int hungerLevel;
    private int moodLevel;
    private int energyLevel;

    // Constructor
    public Pet(String name, String type, int age) {
        Random rand = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hungerLevel = rand.nextInt(10);   // 0–9
        this.moodLevel = rand.nextInt(10);
        this.energyLevel = rand.nextInt(10);
    }

 
    //getter methods to get name, type, age, hunger level, mood level and energy level
    public String getName() {
    	return name; 
    }
    public String getType() {
    	return type; 
    }
    public int getAge() { 
    	return age; 
    }
    public int getHungerLevel() { 
    	return hungerLevel; 
    }
    public int getMoodLevel() {
    	return moodLevel; 
    }
    public int getEnergyLevel() { 
    	return energyLevel; 
    }

    // methods to modify variables
    protected void changeHunger(int value) {
        hungerLevel = Math.max(0, hungerLevel + value);
    }
    protected void changeMood(int value) {
        moodLevel = Math.max(0, moodLevel + value);
    }
    protected void changeEnergy(int value) {
        energyLevel = Math.max(0, energyLevel + value);
    }

    // Abstract method 
    public abstract void makeSound();
    
    @Override
    public void feed() {
        changeHunger(-3);
        changeMood(+2);
    }

    @Override
    public void play() {
        changeMood(+3);
        changeEnergy(-2);
        changeHunger(+1);
    }

    @Override
    public void sleep() {
        changeEnergy(+4);
        changeHunger(+2);
    }
    
    public void showStatus() {
        System.out.println(name + " (" + type + ", age " + age + ")");
        System.out.println("Hunger: " + hungerLevel + ", Mood: " + moodLevel + ", Energy: " + energyLevel);
    }

	
}

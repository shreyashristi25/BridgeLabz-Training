package com.inheritance.multiple;

//creating OnlineClass as subclass of Course class
public class OnlineCourse extends Course{

	String platform;
    boolean isRecorded;

    //constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    //overriden method
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }

	
}

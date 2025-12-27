package com.constructor.level1;

public class Course {

	String courseName;
    int duration;   
    double fee;

    // Class variable 
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method 
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName +", Duration: " + duration +", Fee: " + fee +", Institute: " + instituteName);
    }

    // Class method 
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

}

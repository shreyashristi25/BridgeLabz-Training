package com.inheritance.multiple;

public class Course {

	String courseName;
    int duration; 

    //constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    //method to display course info
    void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }

}

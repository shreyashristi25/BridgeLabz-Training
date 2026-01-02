package com.universitycourseenrollmentsystem;

public class Course {

	private int courseId;
    private String title;
    private int credits;

    //constructor
    public Course(int courseId, String title, int credits) {
        this.courseId = courseId;
        this.title = title;
        this.credits = credits;
    }

    //getter method to getCredits
    public int getCredits() { return credits; }
    public String getTitle() { return title; }

    //method to display course information
    public void displayInfo() {
        System.out.println("Course: " + title + " | Credits: " + credits);
    }

}

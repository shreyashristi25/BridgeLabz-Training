package com.objectmodeling;
import java.util.ArrayList;

public class Student {
	
	private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // creating methods to add course and view the enrolled courses and get name
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

}

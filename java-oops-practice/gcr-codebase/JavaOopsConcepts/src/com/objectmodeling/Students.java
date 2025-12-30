package com.objectmodeling;
import java.util.ArrayList;

public class Students {
	
	private String name;
    private ArrayList<Courses> courses;

    public Students(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    //methods to add course and view courses
    public void addCourse(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Courses c : courses) {
            System.out.println("- " + c.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

}

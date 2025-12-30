package com.objectmodeling;
import java.util.ArrayList;

public class Professor {
	
	private String name;
    private ArrayList<Courses> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    //methods to add course to professor and display courses
    public void addCourse(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("Professor: " + name + " teaches:");
        for (Courses c : courses) {
            System.out.println("- " + c.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }


}

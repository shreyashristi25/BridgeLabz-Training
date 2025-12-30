package com.objectmodeling;
import java.util.ArrayList;

public class Courses {

	private String name;
    private Professor professor;
    private ArrayList<Students> students;

    public Courses(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    //methods to assign professor and enroll students
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this); 
        System.out.println("Professor " + professor.getName() + " assigned to course " + name);
    }

    public void enrollStudent(Students student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this); 
            System.out.println("Student " + student.getName() + " enrolled in course " + name);
        }
    }

    
 // method to Display course details
    public void displayCourse() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Students s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }

     public String getName() {
        return name;
    }


}

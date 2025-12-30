package com.objectmodeling;
import java.util.ArrayList;

public class Course {
	
	private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // methods to enroll a student in this course and display the enrolled students
    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this); 
        }
    }

    public void displayStudents() {
        System.out.println("Course: " + name + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

}

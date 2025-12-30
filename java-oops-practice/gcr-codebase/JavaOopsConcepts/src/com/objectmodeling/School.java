package com.objectmodeling;
import java.util.ArrayList;

public class School {
	private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // creating methods to  add student to school and display them
    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + name + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println();
    }

}

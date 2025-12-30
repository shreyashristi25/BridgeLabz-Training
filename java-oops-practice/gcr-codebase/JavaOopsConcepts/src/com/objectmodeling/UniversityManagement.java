package com.objectmodeling;
import java.util.ArrayList;

public class UniversityManagement {
	
	private String name;
    private ArrayList<Students> students;
    private ArrayList<Professor> professors;
    private ArrayList<Courses> courses;

    public UniversityManagement(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    //methods to add student, professor and course
    public void addStudent(Students student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(Courses course) {
        courses.add(course);
    }
    //method to display university details
    public void displayUniversity() {
        System.out.println("University: " + name);
        System.out.println("Students:");
        for (Students s : students) {
            System.out.println("- " + s.getName());
        }
        System.out.println("Professors:");
        for (Professor p : professors) {
            System.out.println("- " + p.getName());
        }
        System.out.println("Courses:");
        for (Courses c : courses) {
            System.out.println("- " + c.getName());
        }
        System.out.println();
    }


}

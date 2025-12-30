package com.objectmodeling;
import java.util.ArrayList;

public class UniversityDepartment {

	private String name;
    private ArrayList<Faculty> faculties;

    public UniversityDepartment(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    // This is the missing method
    public void addFaculty(String facultyName, String specialization) {
        Faculty f = new Faculty(facultyName, specialization);
        faculties.add(f);
    }

    public void displayDepartment() {
        System.out.println("University Department: " + name);
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
        System.out.println();
    }




}

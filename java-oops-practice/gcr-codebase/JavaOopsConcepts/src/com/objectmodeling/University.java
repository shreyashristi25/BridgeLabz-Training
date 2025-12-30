package com.objectmodeling;
import java.util.ArrayList;

public class University {
	
	private String name;
    private ArrayList<UniversityDepartment> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department
    public UniversityDepartment addDepartment(String deptName) {
        UniversityDepartment dept = new UniversityDepartment(deptName);
        departments.add(dept);
        return dept;
    }

    // Display university details
    public void displayUniversity() {
        System.out.println("University: " + name);
        for (UniversityDepartment dept : departments) {
            dept.displayDepartment();
        }
    }

    // Delete university (composition effect)
    public void deleteUniversity() {
        System.out.println("Deleting University: " + name);
        departments.clear();

    }


}

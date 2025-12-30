package com.objectmodeling;
import java.util.ArrayList;

public class Company {
	
	private String name;
    private ArrayList<Department> departments;

    // Constructor of Company class 
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // creating methods to Add department and display company details
    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    // method to delete company to show composition effect
    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        departments.clear(); 
    }

}

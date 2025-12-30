package com.objectmodeling;

public class Employee {

	 private String name;
	    private String role;

	    // Constructor for Employee class 
	    public Employee(String name, String role) {
	        this.name = name;
	        this.role = role;
	    }

	    // creating method to display employee details
	    public void displayEmployee() {
	        System.out.println("Employee: " + name + " | Role: " + role);
	    }

}

package com.constructor.level1;

public class Manager extends Employee {

	private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method showing access to public and protected members 
    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID +", Department: " + department +", Team: " + teamName);
        
    }

}

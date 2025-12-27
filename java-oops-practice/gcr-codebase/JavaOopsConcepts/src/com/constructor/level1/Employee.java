package com.constructor.level1;

public class Employee {

	//creating variables using different access specifiers
	public int employeeID;

    protected String department;

    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
   //methods to modify and display employee details
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary updated for Employee ID " + employeeID);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID +", Department: " + department +", Salary: " + salary);
    }

}

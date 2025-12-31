package com.inheritance;

public class Employee {
	
	//creating name, id, salary to store name, id and salary
	String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
    }

}

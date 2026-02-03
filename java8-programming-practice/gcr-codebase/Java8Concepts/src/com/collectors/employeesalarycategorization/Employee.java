package com.collectors.employeesalarycategorization;

public class Employee {

	private String name ;
	private String department ;
	private double salary ;
	
	//constructor
	public Employee(String name, String department, double salary) {
		this.name = name  ;
		this.department = department ;
	}
	
	//getters to get name, department and salary of an employee
	public String getName() {
		return name ;
	}
	
	public String getDepartment() {
		return department ;
	}
	
	public double getSalary() {
		return salary ;
	}
}

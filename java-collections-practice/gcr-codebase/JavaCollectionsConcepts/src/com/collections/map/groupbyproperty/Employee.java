package com.collections.map.groupbyproperty;

public class Employee {

	//private variables to ensure limited access 
	private String name ;
	private String department ;
	
	//constructor
	public Employee(String name, String department) {
		this.name = name ;
		this.department = department ;
		
	}
	//getter methods to get name and department name of the employees
	public String getName() {
		return name ;
	}
	
	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		return name ;
	}
}

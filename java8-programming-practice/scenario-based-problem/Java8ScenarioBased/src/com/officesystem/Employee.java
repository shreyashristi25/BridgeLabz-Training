package com.officesystem;

public class Employee {

	String name ; 
	double salary; 
	int experience ;
	
	//constructor
	Employee(String name, double salry, int experience) {
		this.name = name; 
		this.salary = salary ;
		this.experience = experience ;
	}
	
	@Override
	public String toString() {
		return name + " - Salary: " + salary + " - Experience: " + experience + " years";
    }

	
}

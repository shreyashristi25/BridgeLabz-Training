package com.methodreferences.nameuppercasing;

public class Employee {

	String name ;
	String id ;
	
	//constructor
	public Employee(String name, String id) {
		this.name = name ;
		this.id = id  ;
	}
	
	@Override
	public String toString() {
		return "Employee ID : " +id +" : " + name ;
	}
	
}

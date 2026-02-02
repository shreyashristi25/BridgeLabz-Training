package com.functionalinterfaces.dataserialization;

public class Department {

	private String deptName ;
	 
	//constructor
	public Department(String deptName) {
		this.deptName = deptName ;
	}
	
	@Override
	public String toString( ) {
		return "Department : " +deptName ;
	}
}

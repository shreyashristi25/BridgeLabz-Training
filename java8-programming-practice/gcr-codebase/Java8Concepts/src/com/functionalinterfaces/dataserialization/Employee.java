package com.functionalinterfaces.dataserialization;

public class Employee implements BackupSerialization{

	private int id ;
	private String name  ;
	
	//constructor
	public Employee(int id, String name) {
		this.id = id  ;
		this.name = name  ;
	}
	
	@Override 
	public String toString() {
		return "Employee -> id :" +id +" | name : "+name ;
	}
}

package com.streams.objectserialization;
import java.io.* ;
import java.util.* ;

public class Employee implements Serializable{

	public int id ;
	public String name ;
	public String department ;
	public double salary ;
	
	//constructor
	public Employee(int id, String name, String department, double salary) {
		this.id = id ;
		this.name = name ;
		this.department = department ;
		this.salary = salary ;
	}
	
	@Override
	public String toString() {
		return id + " | " + name + " | " + department + " | " + salary;
	}
	
}

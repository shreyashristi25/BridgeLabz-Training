package com.generics.coursemanagement;

public class Course <T extends CourseType>{

	//private variables to ensure limited access
	private String name ;
	private String department ;
	private T type ;
	
	//constructor
	public Course(String name , String department, T type) {
		this.name = name ;
		this.department = department ;
		this.type = type ;
		
	}
	
	//getter methods to get course name, department and type of evaluation
	public String getName() {
		return name ;
		
	}
	
	public String getDepartment() {
		return department ;
	}
	
	public T getType () {
		return type ;
	}
	
	//method to display course details
	public void displayDetails() {
		System.out.println("Course :" + name +" | Department: " +department +" | Evaluation : " +type ) ;
	}
}

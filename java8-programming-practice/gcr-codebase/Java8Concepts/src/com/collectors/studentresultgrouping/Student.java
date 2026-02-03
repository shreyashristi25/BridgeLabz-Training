package com.collectors.studentresultgrouping;

public class Student {

	private String name  ;
	private String gradeLevel ;
	
	//constructor
	public Student(String name , String gradeLevel) {
		this.name = name  ;
		this.gradeLevel = gradeLevel ;
	}
	
	//getters to get name and grade level
	public String getName () {
		return name  ;
	}
	
	public String getGradeLevel() {
		return gradeLevel ;
	}
	
	@Override
	public String toString() {
		return name + " : " +gradeLevel ;
	}
} 

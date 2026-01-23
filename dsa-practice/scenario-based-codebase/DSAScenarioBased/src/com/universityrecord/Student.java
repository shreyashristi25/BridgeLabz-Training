package com.universityrecord;

public class Student {

	public int rollNumber ;
	public String name ;
	public String course ;
	public Student left, right ;
	
	//constructor
	public Student(int rollNumber, String name, String course) {
		this.rollNumber = rollNumber ;
		this.name = name ;
		this.course = course ;
		this.left = null ;
		this.right = null ;
	}
}

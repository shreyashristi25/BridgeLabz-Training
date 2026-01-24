package com.hospitalqueuemanagement;

public class Patient {

	public String name ;
	public int checkInTime ;
	public int height ;
	Patient right, left ;
	
	//constructor
	public Patient (String name, int checkInTime ) {
		this.name = name ;
		this.checkInTime = checkInTime  ;
		this.height = 1 ;
	}
}

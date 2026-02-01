package com.methodreferences.patientidprinting ;

public class Patient {

	private String id  ;
	
	//constructor
	public Patient(String id) {
		this.id = id ;
		
	}
	
	//getter method to get id
	public String getId() {
		return id ;
	}
	
	@Override
	public String toString() {
		return id ;
	}
}

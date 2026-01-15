package com.hospitalqueue;

public class Patient {

	String name ;
	int critical ;
	
	//constructor
	public Patient(String name, int critical) {
		this.name = name ;
		this.critical = critical ;
	}
	
	@Override
	public String toString() {
		return "Patient : " + name +"Criticality : " +critical ;
	}
}

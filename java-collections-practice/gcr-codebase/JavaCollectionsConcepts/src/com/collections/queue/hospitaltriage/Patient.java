package com.collections.queue.hospitaltriage;

public class Patient {

	String name ;
	int severity ;
	
	//constructor
	public Patient(String name, int severity) {
		this.name = name; 
		this.severity = severity ;
	}
	
	@Override
	public String toString() {
		return name +" |Severity : " +severity ;
	}
}

package com.streamapidoctoravailability;

public class Doctor {

	private String name ;
	private String specialty ;
	private boolean avaialable ;
	
	///constructor
	public Doctor(String name, String specialty, boolean avaialabe) {
		this.name = name ;
		this.specialty = specialty ;
		this.avaialable = avaialable ;
		
	}
	
	//getter methods to get name, specialty and availability on weekends of the doctor
	public String getName() {
		return name ;
	}
	
	public String getSpecialty() {
		return specialty ;
	}
	
	public boolean getAvaialability() {
		return avaialable ;
	}
	
	@Override
	public String toString() {
		return name + " : " +specialty + " |Weekend : " +avaialable ;
	}
}

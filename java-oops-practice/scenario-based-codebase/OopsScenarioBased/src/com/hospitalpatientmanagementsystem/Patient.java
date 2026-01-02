package com.hospitalpatientmanagementsystem;

public class Patient {

	private int id ; 
	private String name ; 
	private int age ; 
	private String medicalHistory ;
	
	public Patient (int id, String name, int age ) {
		this.id = id ;
		this.name = name ; 
		this.age = age ; 
		this.medicalHistory = "Not Available" ;
		
	}
	
	public Patient (int id, String name, int age, String medicalHistory ) {
		this.id = id ;
		this.name = name ;
		this.age = age ;
		this.medicalHistory = medicalHistory ;
	}
	
	public String getSummary() {
		return "Patient - " + name +" | Age - " + age  ;
	}
	
	public void displayInfo() {
        System.out.println("Patient Info: " + getSummary());
    }

	
}

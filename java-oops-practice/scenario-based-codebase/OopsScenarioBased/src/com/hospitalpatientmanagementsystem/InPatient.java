package com.hospitalpatientmanagementsystem;

public class InPatient extends Patient{
	
	private int room ;
	
	public InPatient(int id, String name, int age, int room) {
		super(id, name, age) ;
		this.room = room ;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("InPatient in room number  : " +room +" | " +getSummary()) ;
	}

}

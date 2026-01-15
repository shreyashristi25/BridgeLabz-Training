package com.birdsanctuary;

//creating Kiwi as subclass of Bird 
public class Kiwi extends Bird {

	//constructor
	public Kiwi(String id, String name) {
		super(id, name, "Eagle") ;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Duck -> ID : " +getId() +" | Name : " +getName()) ;
	}

}

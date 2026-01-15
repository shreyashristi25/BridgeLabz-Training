package com.birdsanctuary;

//creating Eagle as subclass of Bird that implements Flyable
public class Eagle extends Bird implements Flyable{

	//constructor
	public Eagle(String id, String name) {
		super(id, name, "Eagle") ;
	}
	
	@Override
	public void fly() {
		System.out.println(getName()+" Can Fly!") ;
	}
	@Override
	public void displayDetails() {
		System.out.println("Eagle -> ID : " +getId() +" | Name : " +getName()) ;
	}
}

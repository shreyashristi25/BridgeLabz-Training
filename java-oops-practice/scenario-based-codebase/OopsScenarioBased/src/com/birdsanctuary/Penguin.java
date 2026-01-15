package com.birdsanctuary;

//creating Penguin as subclass of Bird that implements Swimmable
public class Penguin  extends Bird implements Swimmable{

	//constructor
	public Penguin(String id, String name) {
		super(id, name, "Eagle") ;
	}
	
	@Override
	public void swim() {
		System.out.println(getName()+" Can Swim!") ;
	}
	@Override
	public void displayDetails() {
		System.out.println("Penguin -> ID : " +getId() +" | Name : " +getName()) ;
	}
}

package com.generics.resumescreening;

//creating SoftwareEngineer as subclass of JobRole class 
public class SoftwareEngineer extends JobRole{

	//constructor
	public SoftwareEngineer() {
		super("SofwareEngineer") ;
	}
	
	@Override
	public String toString() {
		return "Software Engineer" ;
	}
	
}

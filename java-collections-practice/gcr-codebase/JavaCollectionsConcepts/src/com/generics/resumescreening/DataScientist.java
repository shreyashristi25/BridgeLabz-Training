package com.generics.resumescreening;

//creating DataScientist as subclass of JobnbRole class
public class DataScientist extends JobRole{

	//constructor
	public DataScientist() {
		super("Data Scientist") ;
	}
	
	@Override
	public String toString() {
		return "Data Scientist" ;
	}
} 

package com.birdsanctuary;

public abstract class Bird {

	//private variables to ensure limited access
	private String id ;
	private String name ;
	private String species ;
	
	//constructor
	public Bird(String id, String name, String species) {
		this.id = id ;
		this.name = name ;
		this.species = species ;
	}
	
	//getter methods to get id, name, species of the bird
	public String getId() {
		return id ;
	}
	public String getName() {
		return name ;
	}
	public String getSpecies() {
		return species ;
	}
	
	//abstract method
	public abstract void displayDetails() ;
	
}

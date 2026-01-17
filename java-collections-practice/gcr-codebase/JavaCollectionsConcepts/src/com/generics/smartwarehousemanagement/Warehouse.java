package com.generics.smartwarehousemanagement;

public abstract class Warehouse {

	//private variable to ensure limited acess
	private String name ;
	
	//constructor
	public Warehouse(String name) {
		this.name = name ;
	}
	
	//getter method to get name
	public String getName () {
		return name ;
	}
}

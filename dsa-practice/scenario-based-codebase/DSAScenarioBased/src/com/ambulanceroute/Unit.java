package com.ambulanceroute;

public class Unit {

	String name ;
	boolean available ;
	Unit next ;
	
	//constructor
	Unit(String name) {
		this.name = name ;
		this.available = true ;
		this.next = null ;
	}
}

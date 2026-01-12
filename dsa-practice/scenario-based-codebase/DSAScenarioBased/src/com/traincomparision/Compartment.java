package com.traincomparision;

public class Compartment {

	String id ;
	String service ;
	Compartment prev, next ;
	
	//constructor
	public Compartment(String id, String service) {
		this.id = id ;
		this.service = service;
		this.prev = null ;
		this.next = null ;
	}
	
	@Override
	public String toString() {
		return "Compartment ID :" +id +",  Service : " +service ;
	}
	
}

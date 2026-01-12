package com.trafficmanager;

public class Vehicle {

	String id ;
	String type ;
	Vehicle next ;
	
	public Vehicle(String id, String type) {
		this.id = id ;
		this.type =type ;
		this.next = null;
    }
	
	@Override
	public String toString() {
		return "Vehicle [ ID :" +id +", Type " +type +"]"  ;
	}
}

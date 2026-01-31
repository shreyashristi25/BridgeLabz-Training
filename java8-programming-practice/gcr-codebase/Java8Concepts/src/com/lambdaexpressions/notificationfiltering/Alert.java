package com.lambdaexpressions.notificationfiltering;

public class Alert {

	public String name ;
	public String message ;
	
	//constructor
	public Alert (String name, String message) {
		this.name = name ;
		this.message = message ;
		
	}
	
	@Override
	public String toString() {
		return "Alert! " +name +" : " +message ;
	}
}

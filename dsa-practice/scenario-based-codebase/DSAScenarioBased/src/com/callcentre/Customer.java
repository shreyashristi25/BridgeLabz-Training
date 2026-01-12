package com.callcentre;

public class Customer {

	//variables to store name, customerID, check if the customer is VIP, and store priority of customers
	String name ;
	String customerID ;
	boolean isVIP ;
	int priority ;
	
	//constructor
	public Customer(String name, String customerID, boolean isVIP, int priority) {
		this.name = name ;
		this.customerID = customerID ;
		this.isVIP = isVIP ;
		this.priority = priority ;
		
	}
}
	
package com.collectors.orderrevenuesummary;

public class Order {

	private String customer ;
	private double total ;
	
	//constructor
	public Order(String customer, double total) {
		this.customer = customer  ;
		this.total = total ;
	}
	
	//getters to get customer and their total orders 
	public String getCustomer() {
		return customer ;
	}
	
	public double getTotal() {
		return total ;
	}
	
	
}

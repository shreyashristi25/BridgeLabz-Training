package com.functionalinterfaces.sensistivedatatagging;

public class Product {

	private String name ;
	private double price ;
	
	//constructor
	public Product(String name, double price) {
		this.name = name ;
		this.price = price ;
	}
	
	@Override
	public String toString() {
		return "Product{name='" + name + "', price=" + price + "}";

	}
}

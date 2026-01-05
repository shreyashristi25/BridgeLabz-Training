package com.swiftcart;

public abstract class Product {

	//private variables to ensure limited access
	private String name ;
	private double price ;
	private String category ;
	
	//constructor
	public Product(String name, double price, String category) {
		this.name = name ;
		this.price = price ;
		this.category =  category ;
	}
	
	//getter methods to get name, price and category
	public String getName() {
		return name; 
	}
    public double getPrice() {
    	return price; 
    }
    public String getCategory() {
    	return category; 
    }

    // Protected method so only Cart can update price internally
    protected void setPrice(double price) {
        this.price = price;
    }
	
}

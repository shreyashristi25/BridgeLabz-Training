package com.productinventory;

public class Product {

	public int sku ;
	public String name ;
	public double price ;
	public Product left, right ;
	
	//constructor
	public Product(int sku , String name, double price) {
		this.sku = sku ;
		this.name = name ;
		this.price = price  ;
		this.left = right = null ;
	}
	
}

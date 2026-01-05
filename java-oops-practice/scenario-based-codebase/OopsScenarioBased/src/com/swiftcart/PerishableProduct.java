package com.swiftcart;

//creating PerishableProduct as subclass for Product
public class PerishableProduct extends Product {

	//constructor
	public PerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }
}

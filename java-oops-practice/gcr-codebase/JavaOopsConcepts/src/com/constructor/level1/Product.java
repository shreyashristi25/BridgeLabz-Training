package com.constructor.level1;

public class Product {
	
	//instance variables
	String productName ;
	double price ;
	
	//class variables
	static int totalProducts = 0;
	
	public Product(String productName, double price) {
		this.productName = productName ;
		this.price = price ;
		totalProducts ++ ;
	}
	
	//instance method
	public void displayProductDetails() {
		System.out.println("Product Name :" +productName +", Price :" +price +", Total Products :" +totalProducts);
	}
	
	//class method
	public static void displayTotalProducts() {
		System.out.println("Total Products : " + totalProducts);
    }

}

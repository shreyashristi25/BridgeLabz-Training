package com.encapsulation;

//driver class for Ecommerce system
public class EcommerceMain {

	public static void main(String[] args) {

	 	 //creating object and displaying the result
		 java.util.List<Product> products = new java.util.ArrayList<>();
	     products.add(new Electronics(101, "Laptop", 50000));
	     products.add(new Clothing(102, "Shirt", 2000));
	     products.add(new Groceries(103, "Rice Bag", 1000));

	     ECommercePlatform.printFinalPrices(products);
	}

}

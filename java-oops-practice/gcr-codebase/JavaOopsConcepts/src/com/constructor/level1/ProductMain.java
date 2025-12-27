package com.constructor.level1;

public class ProductMain {
	//creating the driver class for PRoduct class and displaying result
	public static void main(String [] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 25000.0);
        Product p3 = new Product("Headphones", 2000.0);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }

}

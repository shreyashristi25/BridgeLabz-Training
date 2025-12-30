package com.objectmodeling;

public class Ecommerce {

	public static void main(String[] args) {

		// Create products and customers
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Smartphone", 30000);
        Product p3 = new Product("Headphones", 2000);

        // Create customers
        Customers shruti = new Customers("shruti");
        Customers arjun = new Customers("Arjun");

        // shruti places an order
        Order order1 = shruti.placeOrder();
        order1.addProduct(p1);
        order1.addProduct(p3);

        // Arjun places an order
        Order order2 = arjun.placeOrder();
        order2.addProduct(p2);

        // shruti places another order
        Order order3 = shruti.placeOrder();
        order3.addProduct(p2);
        order3.addProduct(p3);

        // View all orders
        shruti.viewOrders();
        arjun.viewOrders();

	}

}

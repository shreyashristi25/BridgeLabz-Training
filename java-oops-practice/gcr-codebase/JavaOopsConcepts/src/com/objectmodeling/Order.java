package com.objectmodeling;
import java.util.ArrayList;

public class Order {
	
	private static int nextOrderId = 1;
    private int orderId;
    private Customers customer;   
    private ArrayList<Product> products;

    public Order(Customers customer) {   
        this.orderId = nextOrderId++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    //creating methods to add products and display order
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added " + product.getName() + " to Order #" + orderId);
    }

    public void displayOrder() {
        System.out.println("Order #" + orderId + " placed by " + customer.getName());
        double total = 0;
        for (Product p : products) {
            p.displayProduct();
            total += p.getPrice();
        }
        System.out.println("Total: " + total);
        System.out.println();
    }

}

package com.objectmodeling;
import java.util.ArrayList;

public class Customers {
	
	private String name;
    private ArrayList<Order> orders;

    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Place an order
    public Order placeOrder() {
        Order order = new Order(this);
        orders.add(order);
        System.out.println(name + " placed a new order.");
        return order;
    }

    // View all orders
    public void viewOrders() {
        System.out.println("Customer: " + name + " has placed the following orders:");
        for (Order o : orders) {
            o.displayOrder();
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

}

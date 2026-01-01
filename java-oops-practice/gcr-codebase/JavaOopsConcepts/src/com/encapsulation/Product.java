package com.encapsulation;

public abstract class Product {

	private int productId;
    private String name;
    private double price;

    //constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // getters and setters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();
}

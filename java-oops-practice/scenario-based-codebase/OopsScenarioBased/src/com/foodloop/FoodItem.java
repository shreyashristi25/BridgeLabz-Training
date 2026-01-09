package com.foodloop;

public class FoodItem{

	//private variables to ensure limited access
	private String name;
    private String category;
    private double price;
    private boolean available;
    private int stock;
	
    //constructor
	public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.available = stock > 0;
    }

	
	//getter methods to get name, category, price and availability
	public String getName() {
		return name ;
	}
	public String getCategory() {
		return category ;
	}
	public double getPrice() {
		return price ;
	}
	public boolean getAvailability() {
		return available ;
	}
	
	// method to make stock availability hidden
    private void updateAvailability() {
        this.available = stock > 0;
    }

    public void reduceStock(int qty) {
        if (stock >= qty) {
            stock -= qty;
            updateAvailability();
        }
    }

}

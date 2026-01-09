package com.foodloop;

//creating class Order that implements IOrderable
public class Order implements IOrderable{

		//private variables to ensure limited access
	    private FoodItem [] items;
	    private int itemCount;
	    private double total;

	    //constructor
	    public Order(int capacity) {
	        items = new FoodItem[capacity];
	        itemCount = 0;
	        total = 0.0;
	    }

	    //method to add item, calculate total, apply discount, place and cancel order 
	    public void addItem(FoodItem item) {
	        if (item.getAvailability() && itemCount < items.length) {
	            items[itemCount++] = item;
	            item.reduceStock(1);
	        }
	    }

	    public double calculateTotal() {
	        total = 0.0;
	        for (int i = 0; i < itemCount; i++) {
	            total += items[i].getPrice();
	        }
	        return applyDiscount(total);
	    }

	    protected double applyDiscount(double amount) {
	        if (amount > 500) return amount * 0.9;  
	        else if (amount > 200) return amount * 0.95; 
	        return amount;
	    }

	    @Override
	    public void placeOrder() {
	        System.out.println("--- Receipt ---");
	        for (int i = 0; i < itemCount; i++) {
	            System.out.println(items[i].getName() + " - $" + items[i].getPrice());
	        }
	        System.out.println("Total after discount: $" + calculateTotal());
	        System.out.println("----------------");
	    }

	    @Override
	    public void cancelOrder() {
	        System.out.println("Order cancelled.");
	        itemCount = 0;
	    }

}

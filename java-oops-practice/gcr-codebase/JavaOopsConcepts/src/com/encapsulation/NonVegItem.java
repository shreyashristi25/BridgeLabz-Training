package com.encapsulation;

//creating NonVegItem as a subclass of FoodItem and Discountable
public class NonVegItem extends FoodItem implements Discountable{

	private double discountApplied;
    private double nonVegCharge = 50; 

    //constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0;
    }

    //overriden methods of FoodItem class
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + nonVegCharge * getQuantity()) - discountApplied;
    }

    @Override
    public void applyDiscount(double percent) {
        discountApplied = (getPrice() * getQuantity() + nonVegCharge * getQuantity()) * (percent / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discountApplied;
    }

}

package com.encapsulation;

//creating VegItem as a subclass of FoodItem and Discountable
public class VegItem extends FoodItem implements Discountable{

	private double discountApplied;

	//constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0;
    }

    //overriden methods of FoodItem class
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discountApplied;
    }

    @Override
    public void applyDiscount(double percent) {
        discountApplied = (getPrice() * getQuantity()) * (percent / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discountApplied;
    }

}

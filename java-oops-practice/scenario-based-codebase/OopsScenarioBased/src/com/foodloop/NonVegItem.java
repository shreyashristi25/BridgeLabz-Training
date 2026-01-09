package com.foodloop;

//creating VegItem as subclass of FoodItem class 
public class NonVegItem extends FoodItem{

	public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Vegetarian", price, stock);
    }

}

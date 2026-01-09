package com.foodloop;

//creating VegItem as subclass of FoodItem class 
public class VegItem extends FoodItem{

	public VegItem(String name, double price, int stock) {
        super(name, "Vegetarian", price, stock);
    }

}

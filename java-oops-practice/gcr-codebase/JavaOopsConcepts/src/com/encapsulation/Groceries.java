package com.encapsulation;

//creating Groceries as subclass of Product
public class Groceries extends Product{

	//constructor
	public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}

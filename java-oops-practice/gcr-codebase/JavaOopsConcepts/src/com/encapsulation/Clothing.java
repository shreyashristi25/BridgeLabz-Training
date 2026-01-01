package com.encapsulation;

//creating clothing as subclass of Product and taxable
public class Clothing extends Product implements Taxable{

	//constructor
	public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "12% GST applied on Clothing";
    }
}

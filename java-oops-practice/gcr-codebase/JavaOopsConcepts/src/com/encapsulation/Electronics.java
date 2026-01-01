package com.encapsulation;

//creating electronics as subclass of product and taxable
public class Electronics extends Product implements Taxable {

	//constructor
	public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied on Electronics";
    }
}

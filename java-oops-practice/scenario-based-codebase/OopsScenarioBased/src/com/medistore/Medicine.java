package com.medistore;
import java.time.LocalDate ;
public abstract class Medicine implements ISellable{

	//private variables to ensure limited accessibility
	private String name ;
	private double price ;
	private LocalDate expiryDate ;
	private int quantity ;
	
	//constructor
	public Medicine(String name, double price, LocalDate expiryDate, int quantity ) {
		this.name = name ;
		this.price = price ;
		this.expiryDate = expiryDate ;
		this.quantity =  quantity ;
	}
	
	//getter methods to get name, expiry date and quantity
	public String getName() {
		return name ;
	}
	
	public LocalDate getExpiryDate() {
		return expiryDate ;
	}
	
	public int getQuantity() {
		return quantity ;
	}
	
	//methods to calculate discount, total price, apply discount, check expiry and sell item
	public double calculateDiscount(double percent) {
		return price - (price * percent / 100) ;
	}
	
	public double totalPrice (int units) {
		return price * units ;
	}
	
	public void applyDiscount(double percent) {
		this.price = calculateDiscount(percent) ;
	} 
	
	public void adjustStock(int change) {
		this.quantity += change ;
	}
	
	public abstract boolean checkExpiry() ;
	
	@Override 
	public void sell(int units) {
		if(units <= quantity) {
			quantity -= units ;
			System.out.println(units +"Units of " +name +" Sold! . Remaining : " +quantity) ;
		}
		else {
			System.out.println("Insufficient Stocks!") ;
		}
	}
	
}

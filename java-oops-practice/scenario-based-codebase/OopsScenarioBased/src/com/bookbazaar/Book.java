package com.bookbazaar;

public abstract class Book implements IDiscountable{

	//private variables to ensure limited access
	private String  title ;
	private String author ;
	private double price ;
	private int stock ;
	
	//constructor
	public Book(String title, String author, double price, int stock) {
		this.title = title ;
		this.author = author ;
		this.price = price ;
		this.stock =  stock ;
	}
	
	//getter methods to get title, author, price and stock
	public String getTitle() {
		return title ;
	}
	public String getAuthor() {
		return author ;
	}
	public double getPrice() {
		return price ;
	}
	public int getStock() {
		return stock ;
	}
	
	//method to reduce stock
	public void reduceStock(int quantity) {
	        if (quantity <= stock) {
	            stock -= quantity;
	        } else {
	            System.out.println("Not enough stock for " + title);
	        }
	    }

	// Abstract discount method
	public abstract double applyDiscount(double price);

}

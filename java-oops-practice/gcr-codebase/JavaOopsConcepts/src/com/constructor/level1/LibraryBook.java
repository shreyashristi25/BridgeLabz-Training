package com.constructor.level1;

public class LibraryBook {

	String title;
	String author;
	double price;
	boolean available;
	
	public LibraryBook() {
		this.title = "Harry Potter";
		this.author = "J.K Rowlings";
		this.price = 100.0;
		this.available = true;
	}
	
	public LibraryBook(String title, String author, double price, boolean available) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.available = available;
	}
	
	public void borrow() {
		if(available) {
			available = false;
			System.out.println("You can borrow the book :" +title) ;
		}
		else {
			System.out.println("Sorry! The book is not available.") ;
		}
	}
	
	public void displayBook() {
		System.out.println("Title :" +title +", Author :" +author +", price :" +price +", Available :");
	}
}

package com.smartshelf;

public class Book {

	String title ;
	String author ;
	String genre ;
	
	//constructor
	public Book(String title, String author) {
		this.title = title ;
		this.author = author ;
		this.genre = genre ;
	}
	
	public String toString() {
		return "Book : " +title + " by " +author ;
	}
}

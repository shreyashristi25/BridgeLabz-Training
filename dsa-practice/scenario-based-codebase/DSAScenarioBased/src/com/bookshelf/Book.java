package com.bookshelf;

public class Book {

	public String title ;
	public String author ;
	
	//constructor
	public Book(String title, String author) {
		this.title =  title ;
		this.author = author ;
	}
	
	@Override
	public String toString() {
		return "\"" + title + "\" by " + author ;
	}
}

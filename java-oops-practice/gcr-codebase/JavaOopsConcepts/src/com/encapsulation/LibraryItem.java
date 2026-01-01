package com.encapsulation;

public abstract class LibraryItem {

	protected String itemId;
    protected String title;
    protected String author;

    //constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    //abstract method
    public abstract int getLoanDuration();

    //getter method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

}

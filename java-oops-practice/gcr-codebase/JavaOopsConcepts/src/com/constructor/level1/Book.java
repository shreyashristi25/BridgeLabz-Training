package com.constructor.level1;

public class Book {
    
    private String title ;
    private String author ;
    private double price ;
    
    //default constructor
    public Book() {
        this.title = "The Catcher in the Rye " ;
        this.author = "J.D. Salinger" ;
        this.price = 100.0 ;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title ;
        this.author = author ;
        this.price = price ;
    }
    
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
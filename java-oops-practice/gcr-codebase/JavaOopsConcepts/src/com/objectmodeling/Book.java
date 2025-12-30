package com.objectmodeling;

public class Book {
    private String title;
    private String author;

    // Constructor of Book class 
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // creating method to display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}


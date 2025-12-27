package com.constructor.level1;

public class BookLibrarySystem {

	public String ISBN;

    protected String title;

    private String author;

    public BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    //public getter and setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN +", Title: " + title +", Author: " + author);
    }

}

package com.constructor.level1;

public class EBook extends BookLibrarySystem {

	private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Method showing access to public and protected members
    public void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN +", Title: " + title +", Author: " + getAuthor() +", File Size: " + fileSizeMB + " MB");
    }

}

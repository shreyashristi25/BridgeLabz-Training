package com.inheritance.single;

public class Author extends Book{
	
	String authorName;
    String bio;

    // Constructor
    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.authorName = authorName;
        this.bio = bio;
    }

    // Overriding displayInfo to include author details
    @Override
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Author: " + authorName);
        System.out.println("Bio: " + bio);
    }

}

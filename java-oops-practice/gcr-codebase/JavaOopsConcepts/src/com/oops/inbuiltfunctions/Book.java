package com.oops.inbuiltfunctions;

public class Book {

	   // creating static and instance variables
	   private static String libraryName;
	   // Instance variables
	   private String title;
	   private String author;
	   private final String isbn; 
	   
	   public Book(String title, String author, String isbn) {
	       this.title = title;
	       this.author = author;
	       this.isbn = isbn;
	   }
	   // Static method to set the library name and Static method to display the library name
	   public static void setLibraryName(String name) {
	       libraryName = name;
	   }
	   
	   public static void displayLibraryName() {
	       System.out.println("Library Name: " + libraryName);
	   }
	   // Method to display book details
	   public void displayBookDetails() {
	      
	       if (this instanceof Book) {
	           System.out.println("Title: " + title);
	           System.out.println("Author: " + author);
	           System.out.println("ISBN: " + isbn);
	       } else {
	           System.out.println("The object is not an instance of the Book class.");
	       }
	   }
	   // Getters for instance variables 
	   public String getTitle() {
	       return title;
	   }
	   public String getAuthor() {
	       return author;
	   }
	   public String getIsbn() {
	       return isbn;
	   }
}




package com.oops.inbuiltfunctions;

//creating a driver class for Book class
public class Library {

	public static void main(String[] args) {
		 	
		   //Displaying result
	       Book.setLibraryName("Egmore Library");
	       
	       Book.displayLibraryName();
	       
	       Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
	       
	       book1.displayBookDetails();


	}

}

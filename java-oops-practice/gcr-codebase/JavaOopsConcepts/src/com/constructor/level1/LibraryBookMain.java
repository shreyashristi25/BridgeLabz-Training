package com.constructor.level1;

public class LibraryBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LibraryBook b1 = new LibraryBook("The Alchemist", "Paulo Coelho", 299.0, true);
	     LibraryBook b2 = new LibraryBook(); 

	        // Display details
	        b1.displayBook();
	        b2.displayBook();

	        // Borrow book
	        b1.borrow();
	        b1.borrow();
	}

}

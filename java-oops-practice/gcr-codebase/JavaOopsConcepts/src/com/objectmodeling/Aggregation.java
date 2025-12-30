package com.objectmodeling;

public class Aggregation {
	public static void main(String arg[]) {

	Book b1 = new Book("The Alchemist", "Paulo Coelho");
    Book b2 = new Book("1984", "George Orwell");
    Book b3 = new Book("Clean Code", "Robert C. Martin");

    // Create libraries for books
    Library cityLibrary = new Library("City Library");
    Library universityLibrary = new Library("University Library");

    // Add books to libraries
    cityLibrary.addBook(b1);
    cityLibrary.addBook(b2);

    universityLibrary.addBook(b2); 
    universityLibrary.addBook(b3);

    // Displaying  libraries
    cityLibrary.displayLibrary();
    universityLibrary.displayLibrary();
	}
   
}

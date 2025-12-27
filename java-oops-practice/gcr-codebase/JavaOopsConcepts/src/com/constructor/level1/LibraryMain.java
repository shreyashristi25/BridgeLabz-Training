package com.constructor.level1;

public class LibraryMain {

	public static void main(String[] args) {
		BookLibrarySystem b1 = new BookLibrarySystem("978-1234567890", "The Alchemist", "Paulo Coelho");
        b1.displayBookDetails();

        b1.setAuthor("P. Coelho");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb1 = new EBook("978-0987654321", "Digital Fortress", "Dan Brown", 2.5);
        eb1.displayEBookDetails();
    }

}

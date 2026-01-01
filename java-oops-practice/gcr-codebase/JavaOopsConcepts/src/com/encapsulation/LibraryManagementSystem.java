package com.encapsulation;

//driver class for all other classes in library management system
public class LibraryManagementSystem {

	public static void main(String[] args) {

		// Array of library items 
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B101", "Java Programming", "James Gosling");
        items[1] = new Magazine("M202", "Tech Monthly", "Editorial Team");
        items[2] = new DVD("D303", "Inception", "Christopher Nolan");

        // iterate and manage items
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            
            Reservable res = (Reservable) item;
            System.out.println("Available: " + res.checkAvailability());
            res.reserveItem("Alice");
            System.out.println("Available after reservation: " + res.checkAvailability());
            System.out.println("-----------------------------------");
        }


	}

}

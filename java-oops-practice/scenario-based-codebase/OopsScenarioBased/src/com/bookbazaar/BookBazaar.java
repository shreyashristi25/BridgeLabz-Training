package com.bookbazaar;
import java.util.* ;
public class BookBazaar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;

		Book [] availableBooks = null; 
        int n = 0;

        //getting user choice
        System.out.println("1. Add books to catalog");
        System.out.println("2. Buy books");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice) {
        case 1:
            System.out.print("Enter number of books to add: ");
            n = sc.nextInt();
            sc.nextLine();

            availableBooks = new Book[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Book " + (i + 1));
                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();

                System.out.print("Stock: ");
                int stock = sc.nextInt();
                sc.nextLine();

                System.out.print("Type (1 for EBook, 2 for PrintedBook): ");
                int type = sc.nextInt();
                sc.nextLine();

                if (type == 1) {
                    availableBooks[i] = new EBook(title, author, price, stock);
                } else {
                    availableBooks[i] = new PrintedBook(title, author, price, stock);
                }
            }
            break;

        case 2:
            System.out.println("You must add books first before buying!");
            break;

        default:
            System.out.println("Invalid choice!");
        }

        // If books were added, allow purchase and display result
        if (availableBooks != null) {
        	System.out.print("\nEnter your name: ");
        	String user = sc.nextLine();
        	Order order = new Order(user, 10);

        	System.out.println("\nAvailable Books:");
        	for (int i = 0; i < n; i++) {
        		System.out.println((i + 1) + ". " + availableBooks[i].getTitle() +" (Price: " + availableBooks[i].getPrice() + ", Stock: " + availableBooks[i].getStock() + ")");
        	}

        	System.out.print("Enter book choice (1-" + n + "): ");
        	int bookChoice = sc.nextInt();
        	System.out.print("Enter quantity: ");
        	int qty = sc.nextInt();

        	if (bookChoice >= 1 && bookChoice <= n) {
        		order.addBook(availableBooks[bookChoice - 1], qty);
        		order.confirmOrder();
        		order.printOrderSummary();
        	}
        	else {
        		System.out.println("Invalid choice!");
        	}
        }

        sc.close();

	}

}

package com.designpattern.librarymanagementsystem;
import java.util.* ;

//Main application for library management system

public class LibraryManagementSystem {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);
    LibraryCatalog catalog = LibraryCatalog.getInstance();

    // User creation
    System.out.print("Enter user type (student/faculty/librarian): ");
    String type = sc.nextLine();
    System.out.print("Enter user name: ");
    String name = sc.nextLine();

    User user = UserFactory.createUser(type, name);
    user.showRole();
    catalog.addObserver(user);

    // Book creation
    System.out.print("Enter book title: ");
    String title = sc.nextLine();
    System.out.print("Enter author (optional, press Enter to skip): ");
    String author = sc.nextLine();
    System.out.print("Enter edition (optional, press Enter to skip): ");
    String edition = sc.nextLine();
    System.out.print("Enter genre (optional, press Enter to skip): ");
    String genre = sc.nextLine();

    Book.BookBuilder builder = new Book.BookBuilder(title);
    if (!author.isEmpty()) builder.author(author);
    if (!edition.isEmpty()) builder.edition(edition);
    if (!genre.isEmpty()) builder.genre(genre);

    Book book = builder.build();
    catalog.addBook(book);

    sc.close();
}
}



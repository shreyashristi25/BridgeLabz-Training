package com.bookshelf;
import java.util.*;

public class BookShelf {

	private Map< String , LinkedList<Book>> catalog = new HashMap<> () ;
	
	//methods to add book, borrow book, return book and display catalog
	public void addBook(String genre, Book book) {
		catalog.putIfAbsent(genre,  new LinkedList<>()) ;
		catalog.get(genre).add(book) ;
		System.out.println(book +" added to " +genre) ;
	}
	
	public void borrowBook(String genre, String title) {
		LinkedList<Book> books = catalog.get(genre) ;
		if(books != null) {
			for(Book b : books) {
				if(b.title.equals(title)) {
					books.remove(b) ;
					System.out.println(b +" borrowed..") ;
					return ;
				}
			}
		}	
		System.out.println("Book not found in this genre! You can try different genre.") ;
	}
	
	public void returnBook(String genre, Book book) {
		catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        System.out.println(book + " returned to " + genre);
	}
	
	public void displayCatalog() {
		if(catalog.isEmpty()) {
			System.out.println("Catalog is empty") ;
			return ;
		}
		for(Map.Entry<String, LinkedList<Book>> entry : catalog.entrySet()) {
			System.out.println("Genre : " +entry.getKey()) ;
			for(Book b : entry.getValue()) {
				System.out.println("  - " +b ) ;
			}
		}
	}
}

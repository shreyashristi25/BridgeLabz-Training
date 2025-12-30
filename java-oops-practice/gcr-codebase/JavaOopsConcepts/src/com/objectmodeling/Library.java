package com.objectmodeling;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor of Library class 
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // creating a method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    //creating a method to display all books in the library
    public void displayLibrary() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println();
    }
}

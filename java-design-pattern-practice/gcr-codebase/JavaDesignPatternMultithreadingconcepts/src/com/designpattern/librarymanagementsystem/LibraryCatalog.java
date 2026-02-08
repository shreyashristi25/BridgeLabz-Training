package com.designpattern.librarymanagementsystem;
import java.util.* ;

//Singleton
public class LibraryCatalog {

	private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }
    
    //methods to add book, observer
    public void addBook(Book book) {
        books.add(book);
        newBookArrived(book.getTitle());
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }


    //method to remove observer and print message for new book arrival
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    private void newBookArrived(String bookName) {
        for (Observer o : observers) {
            o.update("New book available: " + bookName);
        }
    }

}

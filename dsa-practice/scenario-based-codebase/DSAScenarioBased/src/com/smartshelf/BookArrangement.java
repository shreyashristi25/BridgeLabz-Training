package com.smartshelf;
import java.util.* ;

public class BookArrangement {

	private List<Book> readingList;
	
	//constructor
	public BookArrangement() {
		this.readingList = new ArrayList<> () ;
	}
	
	//method to add book
	public void addBook(Book newBook) {
		readingList.add(newBook) ;
		insertionSort() ;
	}
	
	//method to apply insertion sort
	
	private void insertionSort() {
        for (int i = 1; i < readingList.size(); i++) {
            Book book = readingList.get(i);
            int j = i - 1;

            // Comparing titles alphabetically
            while (j >= 0 && readingList.get(j).title.compareToIgnoreCase(book.title) > 0) {
                readingList.set(j + 1, readingList.get(j));
                j--;
            }
            readingList.set(j + 1, book);
        }
    }

    // Displaying current reading list
    public void displayList() {
        System.out.println("--- Reading List (Alphabetical) ---");
        for (Book b : readingList) {
            System.out.println(b);
        }
    }

}

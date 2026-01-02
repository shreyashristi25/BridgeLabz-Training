package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryManagement {

	private BookNode head;
    private BookNode tail;

    // method to add book at beginning
    public void addAtBeginning(int bookId, String title, String author, String genre, boolean isAvailable) {
        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // method to add book at end
    public void addAtEnd(int bookId, String title, String author, String genre, boolean isAvailable) {
        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }


    // method to add book at specific position (1-based index)
    public void addAtPosition(int position, int bookId, String title, String author, String genre, boolean isAvailable) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);
        if (position == 1) {
            addAtBeginning(bookId, title, author, genre, isAvailable);
            return;
        }
        BookNode temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(bookId, title, author, genre, isAvailable);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // method to remove book by Book ID
    public void removeById(int bookId) {
        if (head == null) {
            System.out.println("No books in the library!");
            return;
        }
        BookNode temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found!");
            return;
        }
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        System.out.println("Book with ID " + bookId + " removed.");
    }
    
    // method to search by Book Title
    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                System.out.println("Found: ID=" + temp.bookId + ", Title=" + temp.title +
                        ", Author=" + temp.author + ", Genre=" + temp.genre +
                        ", Available=" + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No book found with Title: " + title);
    }

    // method to search by Author
    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                System.out.println("Found: ID=" + temp.bookId + ", Title=" + temp.title +
                        ", Author=" + temp.author + ", Genre=" + temp.genre +
                        ", Available=" + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No books found by Author: " + author);
    }

    // method to update Availability Status by Book Title
    public void updateAvailability(String title, boolean newStatus) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.isAvailable = newStatus;
                System.out.println("Availability updated for \"" + title + "\" to " + newStatus);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found!");
    }

    // method to display books forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No books in the library!");
            return;
        }
        System.out.println("Books (Forward):");
        BookNode temp = head;
        while (temp != null) {
        	
            System.out.println("ID=" + temp.bookId + " | Title=" + temp.title +
                    " | Author=" + temp.author + " | Genre=" + temp.genre +
                    " | Available=" + temp.isAvailable);
            
            temp = temp.next;
        }
    }

    // method to display books backward
    public void displayBackward() {
        if (tail == null) {
            System.out.println("No books in the library!");
            return;
        }
        System.out.println("Books (Backward):");
        BookNode temp = tail;
        while (temp != null) {
        	
            System.out.println("ID=" + temp.bookId + " | Title=" + temp.title +
                    " | Author=" + temp.author + " | Genre=" + temp.genre +
                    " | Available=" + temp.isAvailable);
            
            temp = temp.prev;
        }
    }

    // method to count total number of books
    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total number of books in library: " + count);
    }



	public static void main(String[] args) {

		LibraryManagement library = new LibraryManagement();

        // Add books
        library.addAtBeginning(101, "The Alchemist", "Paulo Coelho", "Fiction", true);
        library.addAtEnd(102, "1984", "George Orwell", "Dystopian", true);
        library.addAtPosition(2, 103, "To Kill a Mockingbird", "Harper Lee", "Classic", false);

        // Display books
        library.displayForward();
        library.displayBackward();

        // Search
        library.searchByTitle("1984");
        library.searchByAuthor("Harper Lee");

        // Update availability
        library.updateAvailability("The Alchemist", false);
        library.displayForward();

        // Remove book
        library.removeById(103);
        library.displayForward();

        // Count books
        library.countBooks();


	}

}

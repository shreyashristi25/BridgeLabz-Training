package com.encapsulation;

//creating book as a subclass of LibraryItem and Reservable
public class Book extends LibraryItem implements Reservable{

	private boolean isReserved;
    private String borrowerName;

    //constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    //overriden method of LibraryItem class
    @Override
    public int getLoanDuration() {
        return 14; 
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.borrowerName = borrowerName;
            isReserved = true;
            System.out.println(title + " reserved by " + maskBorrowerName());
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }

    private String maskBorrowerName() {
        return borrowerName.charAt(0) + " "; 
    }

}

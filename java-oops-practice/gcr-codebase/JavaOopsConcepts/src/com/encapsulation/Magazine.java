package com.encapsulation;

//creating Magazine as a subclass of LibraryItem and Reservable
public class Magazine extends LibraryItem implements Reservable{

	private boolean isReserved;
    private String borrowerName;

    //constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    //overriden methods of LibraryItem class
    @Override
    public int getLoanDuration() {
        return 7; 
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

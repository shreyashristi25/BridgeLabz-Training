package com.bookbazaar;

public class Order {

	//private variables to ensure limited access
	private String userName ;
	private Book[] books ;
	private int [] quantities ;
	private int count ;
	private String status ;
	
	//constructor
	public Order(String userName, int maxItems ) {
		this.userName = userName;
        this.books = new Book[maxItems];
        this.quantities = new int[maxItems];
        this.count = 0;
        this.status = "PENDING!";

	}
	
	//methods to add book, calculate total price, get status, set status, confirm order , cancel order and print order summary
	public void addBook(Book book , int quantity) {
		if(book.getStock() >= quantity) {
			books[count] = book ;
			quantities[count] =  quantity ;
			count ++ ;
			book.reduceStock(quantity);
		}
		else {
		    System.out.println("Out of stock");
		    cancelOrder(); 
		}

	}
	public double calculateTotal() {
		double total = 0;
		for(int i = 0; i < count; i++) {
			double discountedPrice = books[i].applyDiscount(books[i].getPrice()) ;
			total += discountedPrice * quantities[i] ;
		}
		return total ;
	}
	
	public String getStatus() {
		return status ;
	}
	
	private void setStatus(String newStatus) { 
		this.status = newStatus; 
	}

	public void confirmOrder() {
		if (count > 0) {
	        setStatus("CONFIRMED!");
	    } 
		else {
	        setStatus("FAILED! No items in order.");
	    }

	}
	public void cancelOrder() { 
		setStatus("CANCELLED!");
	}
	
	public void printOrderSummary() {
		System.out.println("Oder for user  : " +userName) ;
		for(int i = 0; i < count; i++) {
			System.out.println(books[i].getTitle() +"x" +quantities[i]) ;
		}
		System.out.println("Total Cost: " + calculateTotal());
        System.out.println("Status: " + status);

	}

}

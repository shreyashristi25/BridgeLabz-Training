package com.bookbazaar;

//creating EBook as subclass of Book
public class EBook extends Book{

	//constructor
	public EBook(String title, String author, double price, int stock) {
		super (title, author,  price, stock) ;
	}
	
	@Override
    public double applyDiscount(double price) {
        return price * 0.80;
    }

}

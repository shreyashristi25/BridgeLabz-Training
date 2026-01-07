package com.bookbazaar;

//creating class PrintedBook as subclass of Book
public class PrintedBook extends Book{

	//constructor
	public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double price) {
        
        return price * 0.90;
    }

}

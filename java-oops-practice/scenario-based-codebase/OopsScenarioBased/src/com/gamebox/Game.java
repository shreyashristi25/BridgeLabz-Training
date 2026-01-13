package com.gamebox;

public abstract class Game implements IDownloadable {

	//private and protected variables to ensure limited access
	protected String title ;
	private String genre ;
	private double price ;
	private double rating ;
	
	//constructor for paid games 
	public Game(String title, String genre, double price, double rating) {
		this.title = title ;
		this.genre = genre ;
		this.price =  price ;
		this.rating = rating ;
	}
	
	//constructor for free games
	public Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }
	
	//getter methods to get title, genre, price and rating
	public String getTitle() {
		return title ;
	}
	
	public String getGenre() {
		return genre ;
	}
	
	public double getPrice () {
		return price ;
	}
	
	public double getRating() {
		return rating ;
	}
	
	//method to apply discount
	public void applyDiscount(double discount) {
        price = (price - discount > 0) ? price - discount : 0;
    }

	@Override
	public abstract void playDemo() ;
}

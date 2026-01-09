package com.artify;

public abstract class Artwork implements IPurchasable{

	//private and protected variable to ensure limited access
	private String title ;
	private String artist ;
	private double price ;
	protected String licenseType ;
	
	//constructor
	public Artwork(String title, String artist, double price, String licenseType) {
		this.title = title ;
		this.artist =  artist ;
		this.price = price ;
		this.licenseType = licenseType ;
	}
	
	//getter methods to get title, artist, price, license type 
	public String getTitle() {
		return title ;
	}
	public String getArtist () {
		return artist ;
	}
	public double getPrice () {
		return price ;
	}
	public String getLicenseType() {
		return licenseType ;
	}
	
	@Override
	public abstract void  purchase(User user) ;
	public abstract void license() ;
	
}

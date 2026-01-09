package com.artify;

//creating class DigitalArt as subclass of Artwork class
public class PrintArt extends Artwork{

	//constructor
	public PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType ) ;
	}
	
	@Override
    public void purchase(User user) {
        user.deductBalance(getPrice());
        System.out.println(user.getName() + " purchased digital artwork: " + getTitle());
    }

    @Override
    public void license() {
        System.out.println("Digital license granted: " + licenseType);
    }

}

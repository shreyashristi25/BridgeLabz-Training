package com.gamebox;

//creating ArcadeGame as subclass of Game that implements IDownloadable
public class ArcadeGame extends Game implements IDownloadable{

	//constructor for paid games
	public ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating) ;
	}
	
	//constructor for free games
	public ArcadeGame(String title, double rating) {
		super(title, "Arcade", rating);
	}
	
	@Override
	public void download() {
		System.out.println("Downloading ArcadeGame : " +title) ;
	}
	
	@Override
	public void playDemo() {
		System.out.println("Playing Arcade demo of " +title +" !") ;
	}
}

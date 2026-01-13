package com.gamebox;

//creating StrategyGame as subclass of Game that implements IDownloadable
public class StrategyGame extends Game implements IDownloadable{

	//constructor for paid games
	public StrategyGame(String title, double price, double rating ) {
		super(title, "Strategy", price, rating) ;
	}
	
	//constructor for free games
	public StrategyGame(String title, double rating) {
		super(title, "Strategy", rating) ;
	}
	
	@Override
	public void download() {
		System.out.println("Downloading StrategyGame " +title) ;
	}
	
	@Override
	public void playDemo() {
		System.out.println("Playing Startegy demo of " +title +"!") ;
	}
}

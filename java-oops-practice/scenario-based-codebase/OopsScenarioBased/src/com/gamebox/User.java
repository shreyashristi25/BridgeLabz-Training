package com.gamebox;
import java.util.* ;

public class User {

	//private variables to ensure limited access
	private String name ;
	private List<Game> ownedGames ;
	
	//constructor
	public User(String name) {
		this.name = name ;
		this.ownedGames =  new ArrayList<>() ;
	}
	
	//method to add game and show owned games
	public void addGame(Game g) {
		ownedGames.add(g) ;
		System.out.println(name + " now owns " + g.getTitle() +"game!");
	}
	
	public void showGames() {
		System.out.println(name +" has games :" ) ;
		for(Game g : ownedGames) {
			System.out.println("Game name : " +g.getTitle() +" | Genre" +g.getGenre() +" | Price : "+g.getPrice()+" | Rating : "+g.getRating()) ;
		}
	}
	
}

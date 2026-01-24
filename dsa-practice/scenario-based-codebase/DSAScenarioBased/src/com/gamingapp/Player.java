package com.gamingapp;

public class Player {

	public String playerName ;
	public int score  ;
	public int height ;
    Player left, right ;
	
    //constructor
	public Player(String playerName , int score ) {
		this.playerName =  playerName ;
		this.score = score  ;
		this.height  = 1 ;
	}
	
}

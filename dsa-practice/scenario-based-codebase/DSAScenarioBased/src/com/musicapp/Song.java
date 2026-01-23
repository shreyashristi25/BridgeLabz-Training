package com.musicapp;

public class Song {

	public int trackID ;
	public String name ;
	public Song right, left ;
	
	//constructor
	public Song(int trackID, String name) {
		this.trackID = trackID ;
		this.name = name ;
		this.right = this.left = null ;	
	}
}


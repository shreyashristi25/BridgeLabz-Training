package com.songvault;

public class Song implements Media{

	private String title;
    private String artist;
    private String duration;
    private String genre;

    //constructor
    public Song(String title, String artist, String duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String getTitle() { 
    	return title;
    }
    
    @Override
    public String getArtist() { 
    	return artist;
    }
    
    @Override
    public String getGenre() { 
    	return genre; 
    }

    @Override
    public String toString() {
        return title + " by " + artist + " [" + duration + "] (" + genre + ")";
    }

}

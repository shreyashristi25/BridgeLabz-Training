package com.streamapi.topmovies;

public class Movie {

	private String title ;
	private double rating;
	private int releaseYear;

	//constructor
	public Movie(String title, double rating,  int releaseYear) {
		this.title = title ;
		this.rating = rating ;
		this.releaseYear = releaseYear ;
	}
	
	//getter methods to get title and rating of the movies and year of release
	public String getTitle() {
		return title ;
	}
	
	public double getRating() {
		return rating ;
	}
	
	public double getReleaseYear() {
		return releaseYear ;
	}
	
	@Override
	public String toString() {
		return title + " : rating : " +rating ;
	}
}

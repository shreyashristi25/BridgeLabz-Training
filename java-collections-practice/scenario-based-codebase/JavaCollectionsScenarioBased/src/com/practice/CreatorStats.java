package com.practice;

public class CreatorStats {

	private String name  ;
	private double [] weeklyLikes ;

	//constructor
	public CreatorStats(String name , double [] weeklyLikes) {
		this.name = name  ;
		this.weeklyLikes = weeklyLikes ;
	}
	
	//getter methods 
	public String getName() {
		return name ;
	}

	public double [] getWeeklyLikes() {
		return weeklyLikes ;
	}
	
}

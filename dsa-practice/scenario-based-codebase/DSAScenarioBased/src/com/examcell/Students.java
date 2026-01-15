package com.examcell;

public class Students {

	String name ;
	int score ;
	
	//constructor
	public Students(String name, int score) {
		this.name = name ;
		this.score = score ;
	}
	
	@Override
	public String toString() {
		return "Student : " + name +" | Score : " +score ;
	}
}

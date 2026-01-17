package com.geomeasure;

public class Line {

	private double x1 , y1, x2, y2 ;
	
	//constructor
	public Line(double x1, double y1, double x2, double y2) {
		this.x1 = x1 ;
		this.y1 = y1 ;
		this.x2 = x2 ;
		this.y2 = y2 ;
	}
	
	//method to calculate length of two lines and comparing the length of both the lines
	public double calculateLength() {
		return Math.sqrt(Math.pow(x2 - x1, 2) +Math.pow(y2 -y1, 2)) ;
	}
	
	public void compareLines(Line other) {
		double len1 = this.calculateLength() ;
		double len2 = other.calculateLength() ;
		
		System.out.println("Length of this line is : " +len1) ;
		System.out.println("Length of other line is : " +len2) ;
		
		if(len1 == len2) {
			System.out.println("Both lines are equal");
		}
		else if (len1 > len2) {
			System.out.println("This line is longer than the other!") ;
		}
		else {
			System.out.println("This line is shorter than the other!") ;
		}
	}
	
	
}

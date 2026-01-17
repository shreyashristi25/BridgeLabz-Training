package com.geomeasure;
import java.util.* ;

public class GeoMeasure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;

		//taking user input for coordinates of both the lines and displaying result
		System.out.println("Enter coordinates of the line(x1, y1, x2, y2 ) : ") ;
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		Line line1 = new Line(x1, y1, x2 ,y2) ;
		
		System.out.println("Enter the coordinates of Line 2 (a1, b1, a2, b2) : ") ;
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		
		Line line2 = new Line(a1, b1, a2 ,b2) ;
		
		System.out.println("Comparing Line 1 with Line 2 :") ;
		line1.compareLines(line2) ;
		
		sc.close();
	}

}

package com.movietimesorting;
import java.util.* ;

public class CinemaHouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking user input for number of shows and their show times
		System.out.println("Enter the umber of shows : ") ;
		int n = sc.nextInt();
		
		System.out.println("Enter the show times (without using ':') (if 9 : 30 -> 930)");
		int [] showTimes = new int [n] ;
		
		for(int i = 0; i < n; i++) {
			showTimes[i] = sc.nextInt();
		}
		
		//creating object of MovieSorting, calling method and displaying result
		MovieSorting movie = new MovieSorting () ;
		movie.bubbleSort(showTimes);
		
		System.out.println("Show Times in ascending order : ") ;
		for(int time : showTimes) {
			int hours = time/100 ;
			int minutes = time % 100 ;
			System.out.printf("%02d:%02d\n", hours, minutes) ;
		}

	}

}

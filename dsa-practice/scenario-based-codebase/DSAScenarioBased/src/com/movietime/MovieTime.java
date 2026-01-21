package com.movietime;
import java.util.* ;

public class MovieTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of shows
		System.out.println("Enter the number of shows : ") ;
		int n = sc.nextInt() ;

		int [] showTimes = new int [n] ;
		
		System.out.println("Enter the showTimes (if 1:30 -> 130) : ") ;
		for( int i =0; i < n; i++) {
			showTimes[i] = sc.nextInt() ;
		}
		
		//calling sorting method
		SortMovie.insertionSort(showTimes);
		
		//displaying sorted show times
		System.out.println("Sorted Showtimes:");
        for (int time : showTimes) {
            int hours = time / 100;
            int minutes = time % 100;
            System.out.printf("%02d:%02d\n", hours, minutes);
        }

        sc.close();
    }

	

}

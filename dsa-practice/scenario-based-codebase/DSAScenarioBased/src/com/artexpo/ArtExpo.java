package com.artexpo;
import java.util.* ;

public class ArtExpo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//taking user input for number of  registration, name of artists and time of registration of the artiest
		System.out.println("Enter the number of registrations : ") ;
		int n =  sc.nextInt();
		
		
		int time [] = new int [n] ;
		String names [] = new String[n] ;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the time of registration  (if 9 : 30 -> 930)") ;
			time[i] = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of the artist : ") ;
			names[i] = sc.nextLine();
				
		}
		
		//displaying the time of registration and artist name in both sorted and unsorted form
		
		ArtistSort artist = new ArtistSort() ;
		System.out.println(" Registrtions (unsorted) :") ;
		artist.displayRegistrations(time, names) ;
		
		System.out.println();
		artist.insertionSort(time, names) ;

		System.out.println(" Registrtions (Sorted) :") ;
		artist.displayRegistrations(time, names) ;
		
		
		
		
	}

}

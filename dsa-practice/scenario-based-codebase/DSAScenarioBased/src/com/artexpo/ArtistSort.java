package com.artexpo;

public class ArtistSort {

	//method to apply insertion sort for both name and time array
	public void insertionSort(int [] arr, String []  names) {
		
		int n = arr.length ;
		for(int i = 1; i < n; i++) {
			int key = arr[i] ;
			String keyName = names[i] ;
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j] ;
				names [j + 1] = names [j] ;
				j -- ;
			}
			arr[j + 1] = key ;
			names [j + 1] = keyName ;
		}
	}
	
	//method to display the registration with artist name and their time of registration
	public void displayRegistrations(int [] arr, String [] names) {
		
		for(int i = 0; i < arr.length ; i++ ) {
			int hours =arr[ i ]/ 100 ;
			int minutes = arr[ i] % 100 ;
			System.out.printf("%s registered at : %02d:%02d\n", names[i], hours, minutes) ;
		}
	}
}

package com.smartlibrary;

public class SortBook {

	//method for applying insertion sort
	public void insertionSort(String [] books, int n ) {
		for(int i = 1; i < n; i ++) {
			String key = books[i] ;
			int j = i-1 ;
			
			while(j >= 1 && books[j].compareToIgnoreCase(key)> 0) {
				books[j + 1] = books[j] ;
				j-- ;
			}
			books[j +1] = key ;
		}
	}
}

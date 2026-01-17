package com.icecreamrush;

public class SortingFlavors {

	//method to apply bubble sort 
	public void bubbleSort(int sales [], String flavors []) {
		int n = sales.length ;
		
		for( int i = 0; i < n-1; i++) {
			boolean swapped = false ;
			for(int j = 0; j < n - i - 1; j++) {
				if(sales[j] > sales [j+1]) {
					int temp = sales[j] ;
					sales[j] =  sales[j+1] ;
					sales[j+1] = temp ;
					
					String tempFlavor = flavors[j] ;
					flavors[j] = flavors[j+1] ;
					flavors[j+1] = tempFlavor ;
					swapped = true ;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}
}

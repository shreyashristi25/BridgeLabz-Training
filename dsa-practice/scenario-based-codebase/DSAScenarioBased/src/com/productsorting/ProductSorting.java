package com.productsorting;

public class ProductSorting {

	//method to apply quickSort
	public void quickSort(Product [] arr, int low, int high ) {
		if(low < high) {
			int p = partition(arr, low, high) ;
			
			quickSort(arr, low, p-1) ;
			quickSort(arr, p + 1, high) ;
		}
	}
	
	//helper method for quickSort
	public int partition(Product [] arr, int low, int high) {
		int pivot = arr[high].discount ;
		int i = low - 1 ;
		for(int j = low; j < high; j++) {
			if(arr[j].discount > pivot) {
				i++ ;
				Product temp = arr[i] ;
				arr[i] =  arr[j] ;
				arr[j] = temp ;
			}
		}
		Product temp = arr[i + 1] ;
		arr[i + 1] = arr[high] ;
		arr[high] = temp ;
		return i + 1 ;
	}
	
}

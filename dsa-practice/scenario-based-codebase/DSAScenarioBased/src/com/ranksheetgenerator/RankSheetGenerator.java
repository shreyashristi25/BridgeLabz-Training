package com.ranksheetgenerator;

public class RankSheetGenerator {

	//method to apply merge sort
	public static void mergeSort(Student [] arr, int low, int high) {
		if(low < high) {
			int mid = (low + high) /2 ;
		
			mergeSort(arr, low, mid) ;
			mergeSort(arr, mid + 1, high) ;
			merge(arr, low, mid, high) ;
		}
	}
	
	//merge method as a helper method for mergeSort method 
	public static void merge(Student [] arr, int low, int mid, int high) {
		
		int n1 = mid - low +1 ;
		int n2 = high - mid ;
		
		Student [] L = new Student[n1] ;
		Student [] R =  new Student [n2] ;
		
		for(int i = 0; i < n1; i++) {
			L[i] = arr[low + i] ;
		}
		for(int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j] ;
		}
		
		int i = 0, j = 0, k = low ;
		
		while(i < n1 && j < n2 ) {

			if(L[i].score <= R[j].score ) {
				arr[k++] = L[i++] ;
			}
			else {
				arr[k++] = R[j++] ;
			}
		}
		
		while(i < n1) {
			arr[k++] = L[i++] ;
		}
		while(j < n2) {
			arr[k++] = R[j++] ;
		}
	}
}

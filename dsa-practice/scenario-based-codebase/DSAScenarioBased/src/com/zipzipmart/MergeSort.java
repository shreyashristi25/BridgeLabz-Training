package com.zipzipmart;

public class MergeSort {

	//method for applying merge sort 
	public static void mergeSort(Sale [] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid) ;
			mergeSort(arr, mid+1, right) ;
			merge(arr, left, mid, right) ;
		}
	}
	
	//merge method for merge sort
	public static void merge(Sale [] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right -  mid ;
		
		Sale [] L =  new Sale[n1] ;
		Sale [] R = new Sale [n2] ;
		
		for(int i = 0; i < n1; i++) {
			L[i] = arr[left + 1] ;
		}
		for(int j = 0; j < n2; j++) {
			R[j] =  arr[mid + 1 + j] ;
		}
		
		int i = 0, j = 0, k = left ;
		
		while(i < n1 && j < n2) {
			if(L[i].amount <= R[j].amount) {
				arr[k++] = arr[i++] ;
			}
			else {
				arr[j++] = R[i++] ;
			}
		}
		while(i < n1) {
			arr[k++] = L[i++] ; 
		}
		while(i < n2) {
			arr[k++] = R[j++] ;
		}
	}
}

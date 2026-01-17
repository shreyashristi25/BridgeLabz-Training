package com.fleetmanager;

public class VehicleMaintenanceScheduler {

	//method to apply mergeSort
	public void mergeSort(int [] mileage, int left, int right) {
		if(left <  right) {
			int mid = (left + right) / 2 ;
			mergeSort(mileage, left, mid) ;
			mergeSort(mileage, mid + 1 , right) ;
			merge(mileage, left, mid, right) ;
		}
	}
	
	//internal method to help mergeSort
	private void merge(int [] mileage, int left, int mid, int right) {
		int n1 = mid -  left + 1 ;
		int n2 = right - mid ;
		
		int []  L = new int [n1];
		int [] R = new int [n2] ;
		for(int i = 0; i < n1; i++) {
			L[i] = mileage[left + i] ;
		}
		for(int i = 0; i < n2; i++) {
			R[i] = mileage[mid + i + 1] ;
		}
		
		int i = 0, j = 0, k = left ;
		while( i  < n1 && j < n2) {
			if(L[i] <= R[j]) {
				mileage[k++] = L[i++] ;
			}
			else {
				mileage[k ++] = R[i++] ;
			}
		}
		
		while( i  < n1) {
			mileage[k++] = L [i++] ;
		}
		while( j < n2) {
			mileage[k++] = R[j++] ;
		}	
		
	}
}

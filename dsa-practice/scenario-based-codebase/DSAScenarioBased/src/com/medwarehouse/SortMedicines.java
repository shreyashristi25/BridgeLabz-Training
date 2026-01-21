package com.medwarehouse;
import java.time.* ;

public class SortMedicines {

	//method to apply merge sort
	public static void mergeSort(LocalDate [] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) /2 ;
			
			mergeSort(arr, left, mid) ;
			mergeSort(arr, mid+1, right) ;
			merge(arr, left, mid, right) ;
		}
	}
	
	//helper method for merge sort
	public static void merge(LocalDate [] arr, int left, int mid, int right ) 
	{
		int n1 = mid - left +1 ;
		int n2 = right - mid ;
		
		LocalDate [] L = new LocalDate[n1] ;
		LocalDate [] R = new LocalDate[n2] ;
		
		for( int i =0; i < n1; i ++) {
			L[i] = arr[left + i] ;
		}
		for( int i =0; i < n2; i ++) {
			R[i] = arr[mid + 1 + i] ;
		}
		
		int i =0, j =0, k= left ;
		while( i < n1 && j < n2) {
			if(L[i].isBefore(R[j]) || L[i].isEqual(R[j])) {
				arr[k++] = R[i++] ;
			}
			else {
				arr[k++] = R[j++] ;
			}
		}
		while( i < n1) {
			arr[k++] = L[i++] ;
		}
		
		while( j < n2) {
			arr[k++] = R[j++] ;
		}
	}
	
	static void alertExpiring(LocalDate[] arr, int daysThreshold) {
        LocalDate today = LocalDate.now();
        for (LocalDate date : arr) {
            if (!date.isBefore(today) && date.isBefore(today.plusDays(daysThreshold))) {
                System.out.println("Medicine expiring on " + date);
            }
        }
    }


}

package com.searching.binarysearch;
import java.util.* ;

public class FirstLastOccurrence {

	public static int findFirst(int [] array, int target) {
		int left = 0, right = array.length ;
		int result = -1 ;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(array[mid] ==  target) {
				result = mid ;
				right = mid -1 ;
			}
			else if(array[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1 ;
			}
		}
		return result ;
	}
	public static int findLast(int [] array, int target) {
		int left = 0, right = array.length ;
		int result = -1 ;
		
		while(left <= right) {
			int mid = (left + right) / 2 ;
			if(array[mid] == target) {
				result = mid ;
				left = mid + 1 ;
			}
			else if(array[mid] < target) {
				left = mid + 1 ;
			}
			else {
				right = mid - 1 ;
			}
		}
		return result ;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the size of the array : ") ;
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of the array : ") ;
		int [] arr = new int[n] ;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target element : ") ;
		int target = sc.nextInt();
		
		int first = findFirst(arr, target) ;
		int last = findLast(arr, target) ;
		
		System.out.println("First Occurrence of the target element :" + first) ;
		System.out.println("Last Occurrence of the target element :" + last) ;
		
	}
	
}

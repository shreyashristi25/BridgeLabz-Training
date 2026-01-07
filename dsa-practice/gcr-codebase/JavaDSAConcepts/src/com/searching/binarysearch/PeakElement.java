package com.searching.binarysearch;
import java.util.* ;
public class PeakElement {

	//method to find peak element
	public static int findPeak(int [] arr) {
		int left = 0, right = arr.length -1 ;
		
		while(left < right) {
			int mid = (left + right) / 2 ;
			
			if(arr[mid] < arr[mid + 1]) {
				left = mid + 1 ;
			}
			else{
				right = mid ;
			}
		}
		return arr[left];
	}
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		//Taking user input and displaying result
		System.out.println("Enter the number of elements in the array :") ;
		int size = sc.nextInt();
		
		System.out.println("Enter the elements of the array : ") ;
		int [] array = new int[size] ;
		
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		int peak = findPeak(array) ;
		System.out.println("The peak element in the array is : " +peak) ;
		
	}
}

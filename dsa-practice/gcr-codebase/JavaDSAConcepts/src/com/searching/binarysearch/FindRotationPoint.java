package com.searching.binarysearch;
import java.util.* ;

public class FindRotationPoint {
	
	//method to find rotation point
	public static int findRotationPoint(int [] array) {
			
		int left = 0, right = array.length-1;
		while (left < right) {
			int mid = (left + right) / 2;

	        if (array[mid] > array[right]) {
	        	left = mid + 1; 
	        }
	        else {
	                right = mid; 
	        }
	      }
	        return left; 
	}
		
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in) ;
			
	//Taking user input and displaying result
	System.out.println("Enter the number  of elements in  the array : ") ;
	int n = sc.nextInt();
		
	int [] array = new int [n] ;
	System.out.println("Enter the elements of the array : ") ;
	for(int i = 0; i < n; i++) {
		array[i] =  sc.nextInt();
	}
		
	int rotationIndex = findRotationPoint(array);
	System.out.println("Rotation point index: " + rotationIndex);
	System.out.println("Smallest element: " + array[rotationIndex]);
			
	}
	
}

package com.challengeproblems;
import java.util.* ;
public class PositiveIntegerAndTargetIndex {

	//method to find first missing positive integer from range 1 to n 
	public static int firstMissingPositiveInteger (int [] arr) {
		 int n = arr.length;
	     boolean [] visited = new boolean[n + 1]; 

	     for (int x : arr) {
	    	 if (x >= 1 && x <= n) {
	    		 visited[x] = true;
	         }
	     }
	     
	    for (int i = 1; i <= n; i++) {
	    	if (!visited[i]) {
	    		return i;
	        }
	    }

	    return n + 1;

	}
	
	//method to find the index of the target element
	public static int findIndexOfTargetNumber (int [] arr, int target) {
		int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid  ;
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1; 
	}
	
	public static void main(String args []) {
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Enter the number of elements in the array : ") ;
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of the array :" ) ;
		int [] array = new int [n] ;
		for(int i = 0; i  < n ; i++) {
			array[i] = sc.nextInt();
		}
		
		int firstMissing =  firstMissingPositiveInteger(array) ;
		System.out.println("First missing positive integer in the given array is : " +firstMissing) ;
		
		System.out.println("Enter the number to search : " ) ;
		int target = sc.nextInt();
		
		int index = findIndexOfTargetNumber(array, target ) ;
		System.out.println("The index of the target number is : " +index ) ;
	}
}

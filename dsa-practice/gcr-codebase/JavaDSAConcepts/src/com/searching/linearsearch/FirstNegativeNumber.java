package com.searching.linearsearch;
import java.util.* ;
public class FirstNegativeNumber {
	
	public static int searchNegative(int [] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				return i+1 ;
			}
			
		}
		return -1 ;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Enter the number of elements in the array :");
		int size = sc.nextInt();
		
		int [] numbers = new int[size] ;
		int index = 0 ;
		
		System.out.println("Enter the elements of the array: ") ;
		for(int i  = 0 ; i < size; i++) {
			numbers[i] = sc.nextInt();
			
		}
		int result = searchNegative(numbers) ;
		
		System.out.println("The position of first negative number is : " +result) ;
	}
}

package com.exceptionhandling;
import java.util.* ;

public class ArrayOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input and handling ArrayIndexOutOfBound exception, null pointer exception using multiple catch blocks
		try {
			System.out.println("Enter the size of the array : ") ;
			int size = sc.nextInt() ;
			
			int []  arr = new int[size] ;
			
			System.out.println("Enter the elements of the array : ") ;
			for(int i = 0; i <size; i++) {
				arr[i] = sc.nextInt() ;
			}
			
			System.out.println("Enter the index you want to retrieve : ") ;
			int index = sc.nextInt( ) ;
			
			int value = arr[index] ;
			
			System.out.println("Value at index " +index +" : " +value) ;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index!" ) ;
			
		}
		catch(NullPointerException e) {
			System.out.println("Array is not initialized!") ;
		}
		catch(Exception e) {
			System.out.println("Invalid input! Enter valid numeric value.") ;
		}
		
		sc.close();
		

	}

}

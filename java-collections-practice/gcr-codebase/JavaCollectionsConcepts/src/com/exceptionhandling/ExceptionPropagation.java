package com.exceptionhandling;
import java.util.* ;

public class ExceptionPropagation {

	//method to perform divison of two numbers
	public static void method1(int n1, int n2) {
		int result = n1/n2 ;
		System.out.println("Result : " +result) ;
	}
	
	//method calls method1
	public static void method2(int n1, int n2) {
		method1(n1, n2) ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input and handling exception
		try {
			System.out.println("Enter first integer : ") ;
			int n1 = sc.nextInt() ;
			
			System.out.println("Enter second integer : ") ;
			int n2 = sc.nextInt() ;
			
			method2(n1, n2) ;
		}
		catch (ArithmeticException e) {
	            
			System.out.println("Handled exception in main");
	    } 
		catch (Exception e) {
	           
			System.out.println("Invalid input! Please enter numeric values.");
	    } 
		
		sc.close() ;
	}

}

package com.exceptionhandling;
import java.util.* ;

public class DivisionException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for two numbers and handling arithmetic and input mismatch exception
		try {
			System.out.println("Enter the first number : ") ;
			int n1 = sc.nextInt();
			
			System.out.println("Enter the second number  : ") ;
			int n2 = sc.nextInt() ;
			
			int result = n1/n2 ;
			System.out.println("Result : " +result) ;
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Division by Zero not allowed!") ;
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a valid numeric value!" ) ;
		}
		sc.close();

	}

}

package com.junit.main.exceptionhandling;
import java.util.* ;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Calculator calculator = new Calculator() ;
		
		//taking user input and displaying result accordingly
		System.out.println("Enter first number : ") ;
		int n1 = sc.nextInt();

		System.out.println("Enter second number : ") ;
		int n2 = sc.nextInt();
		
		try {
			int result = calculator.divide(n1, n2);
			System.out.println(n1 +" / "+n2 +" = "+result) ;
		}
		catch(ArithmeticException e) {
			System.out.println("Error : " +e.getMessage()) ;
		}

	}

}

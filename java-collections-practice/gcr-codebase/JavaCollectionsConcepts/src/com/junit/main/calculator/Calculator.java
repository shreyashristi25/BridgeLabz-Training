package com.junit.main.calculator;

public class Calculator {

	//methods to add, subtract, multiply and divide two numbers
	public static int add(int a, int b) {
		return a + b ;
	}
	
	public static int subtract(int a , int b ) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Didide by Zero is not allowed!") ;
		}
		return a / b ;
	}
}

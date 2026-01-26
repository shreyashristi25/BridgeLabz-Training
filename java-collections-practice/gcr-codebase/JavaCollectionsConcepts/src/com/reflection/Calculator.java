package com.reflection;
import java.util.* ;
import java.lang.reflect.* ;

public class Calculator {

	//method to multiply two numbers
	private int multiply(int a, int b) {
		return a * b ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for two numbers to multiply
		System.out.println("Enter first number : ") ;
		int n1 = sc.nextInt( ) ;
		
		System.out.println("Enter the second number  : ") ;
		int n2 = sc.nextInt();
		
		//invoking private method using reflection
		try {
			
            Calculator calc = new Calculator();

            Class<?> cls = calc.getClass();

            Method multiplyMethod = cls.getDeclaredMethod("multiply", int.class, int.class);

            multiplyMethod.setAccessible(true);

            Object result = multiplyMethod.invoke(calc, n1, n2);

            System.out.println("Result (via reflection): " + result);

		}
		
		catch (Exception e){
			e.printStackTrace();
		}

	}

}

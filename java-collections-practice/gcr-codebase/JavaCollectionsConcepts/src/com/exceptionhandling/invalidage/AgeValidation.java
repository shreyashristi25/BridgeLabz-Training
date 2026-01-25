package com.exceptionhandling.invalidage;
import java.util.* ;

public class AgeValidation {

	//method to valid date age 
		public static void validateAge(int age) throws InvalidAgeException {
			if(age < 18) {
				throw new InvalidAgeException("Age must be above 18" ) ;
				
			}
			else {
				System.out.println("Access Garnted") ;
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in) ;
			
			//taking user input and handling exception
			try {
				System.out.println("Enter your age  : " ) ;
				int age = sc.nextInt() ;
				
				validateAge(age) ;
			}
			catch (InvalidAgeException e) {
				System.out.println(e.getMessage()) ;
			}
			catch(Exception e) {
				System.out.println("Invalid Input! Enter a numeric value.") ;
			}
			
			sc.close() ;
			
	}

}

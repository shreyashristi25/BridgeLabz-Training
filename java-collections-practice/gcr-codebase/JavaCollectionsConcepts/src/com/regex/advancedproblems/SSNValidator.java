package com.regex.advancedproblems;
import java.util.* ;
import java.util.regex.* ;

public class SSNValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking ssn from user, validating using regex
		System.out.println("Enter SSN : ") ;
		String ssn =  sc.nextLine() ;
		
		String ssnRegex = "^\\d{3}-\\d{2}-\\d{4}$";
		
		if(ssn.matches(ssnRegex)) {
			System.out.println(ssn +" is Valid!") ;
		}
		else {
			System.out.println(ssn +" is Invalid!") ;
		}
		
		System.out.println("Enter Username : ") ;
		String username =  sc.nextLine() ;
		String userRegex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

 
		if (username.matches(userRegex)) {
            System.out.println( username + " is Valid");
        }
		else {
            System.out.println( username + " is Invalid");
        }

        sc.close();


	}

}

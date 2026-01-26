package com.regex;
import java.util.* ;

public class UsernameValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user name as input and validating it 
		System.out.println("Enter a username : ") ;
		String username = sc.nextLine() ;
		
		//username must start with a letter, allows only letters/numbers/underscore, length should be 5-25
		String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$" ;
		if(username.matches(regex)) {
			System.out.println(username +" is valid!") ;
		}
		
		else {
			System.out.println(username + " is Invalid!") ;
		}
		
		sc.close();
		

	}

}

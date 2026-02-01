package com.functionalinterfaces.stringlengthchecker;
import java.util.* ;
import java.util.function.* ;

public class StringLengthChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking character limit and string as user input 
		System.out.println("Enter character limit : ") ;
		int limit = sc.nextInt() ;
		sc.nextLine() ;
		
		System.out.println("Enter the string : ") ;
		String message = sc.nextLine();
		
		//creating Function object and using Function functional interface to convert string into length integer 
		Function<String, Integer> lengthChecker = msg -> msg.length();
		
		int length = lengthChecker.apply(message) ;
		
		if(length > limit) {
			System.out.println("ALERT !!!! Message length exceeded..") ;
			
		}
		else {
			System.out.println("OK!!. Message length is acceptable.") ;
		}

	}

}

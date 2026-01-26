package com.regex.advancedproblems;
import java.util.* ;
import java.util.regex.* ;

public class CreditCardValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking card number as user input and validating if it is a visa card, master card or is invalid
		System.out.println("Enter a credit card number : ") ;
		String cardNo = sc.nextLine( ) ;
		
		String visaRegex = "^4[0-9]{15}$" ;
		String masterRegex = "^5[0-9]{15}$" ;
		
		if(cardNo.matches(visaRegex)) {
			System.out.println(cardNo +" is Valid Visa card!") ;
		}
		else if (cardNo.matches(masterRegex)) {
			System.out.println(cardNo +" is Valid Master card!") ;
		}
		else {
			System.out.println(cardNo +" is Invalid!") ;
		}
		
		sc.close();
		

	}

}

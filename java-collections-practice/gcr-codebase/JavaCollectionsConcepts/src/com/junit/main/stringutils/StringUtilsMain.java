package com.junit.main.stringutils;
import java.util.* ;

public class StringUtilsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		StringUtils stringutils = new StringUtils() ;
		
		//taking string and user choice as input
		System.out.println("Enter a string : ") ;
		String string = sc.nextLine();
		
		System.out.println("Enter the operation you want to perform(reverse/checkPalindrome/toUpperCase) : ") ;
		String choice = sc.nextLine();
		
		String result = "";
		
		//displaying result according to user input
		
		switch (choice.toLowerCase()) {
		case "reverse":
			result = stringutils.reverse(string);
			break;
		case "checkpalindrome":
			boolean palindrome = StringUtils.isPalindrome(string);
            if (palindrome) {
                System.out.println("The string IS a palindrome.");
            } 
            else {
                System.out.println("The string is NOT a palindrome.");
            }
            break;

		case "touppercase":
			System.out.println("Result: " + StringUtils.convertToUpperCase(string));
            break;
		default:
			System.out.println("Invalid operation!");
			return;
        }
		
        sc.close();

	}

}

package com.stringbuilder;
import java.util.* ;

public class ReverseString {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		//Taking user input and displaying result
		StringBuilder reversed = new StringBuilder() ;
		
		System.out.println("Enter the string :") ;
		String original = sc.nextLine() ;
		reversed.append(original) ;
		
		reversed.reverse();
		
		System.out.println("Original String :" + original) ;
		System.out.println("Reversed String :" + reversed) ;
	}
	
}

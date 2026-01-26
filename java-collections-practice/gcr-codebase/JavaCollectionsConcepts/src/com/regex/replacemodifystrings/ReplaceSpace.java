package com.regex.replacemodifystrings;
import java.util.* ;
import java.util.regex.* ;

public class ReplaceSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking sentence as user input and replace the spaces with single space 
		System.out.println("Enter a sentence : " ) ;
		String text = sc.nextLine() ;
		
		String cleared = text.replaceAll("\\s+", " ") ;
		System.out.println("Output : " +cleared) ;
		
		sc.close( ) ;
	}

}

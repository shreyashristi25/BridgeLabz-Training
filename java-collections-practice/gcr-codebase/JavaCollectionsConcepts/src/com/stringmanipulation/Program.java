package com.stringmanipulation;

public class Program {

	//method to reverse a string
	public static String reverse(String s) {
		char [] arr = s.toCharArray() ;
		String reversed = "" ;
		for( int i = s.length()-1 ; i >= 0; i--) {
			reversed += arr[i] ;
		}
		return reversed ;
	}
	
	
	//method to clean and invert the given string input
	public static String cleanseAndInvert(String input) {
		if(input.length() < 6 ) {
			return "" ;
		}
		String lower = input.toLowerCase() ;
		String s = "" ;
		for( int i = 0; i < lower.length(); i++) {
			char ch = lower.charAt(i);
			if(ch >= 97 && ch <= 122) {
				s += ch;
			}
			else {
				return "";
			}
		}
			
		String reversed = reverse(s) ;
		String result = "" ;
		int index = 0;
		for( int i = 0; i < reversed.length(); i++) {
			char ch = reversed.charAt(i);
			if(ch % 2 == 0) {
				continue;
			}
			else {
				if(index % 2 == 0) {
					result += Character.toUpperCase(ch);
				}
				else {
					result += ch;
				}
			}
			index++;
		}
	
		return result ;
	}
}

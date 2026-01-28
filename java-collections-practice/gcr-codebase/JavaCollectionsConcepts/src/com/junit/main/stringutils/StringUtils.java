package com.junit.main.stringutils;

public class StringUtils {

	//methods to revrese a string, check if it is a palindrome and convert the string to upper case
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();

	}
	
	public static boolean isPalindrome(String s) {
		String result = reverse(s) ;
		return result.equals(s) ;
	}

	public static String convertToUpperCase(String s) {
		return s.toUpperCase() ;
	}
}

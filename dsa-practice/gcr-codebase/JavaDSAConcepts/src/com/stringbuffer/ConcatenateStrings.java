package com.stringbuffer;
import java.util.* ;

public class ConcatenateStrings {
	
		//method to concatenate strings using string buffer
		public static String concat(String s1, String s2) {
			StringBuffer sb = new StringBuffer () ;
			sb.append(s1) ;
			sb.append(s2) ;
			return sb.toString() ;
		}
		
		public static void main(String args []) {
			Scanner sc = new Scanner (System.in) ;
			
			System.out.println("Enter the first string : ") ;
			String str1 = sc.nextLine();
		
			System.out.println("Enetr second string :") ;
			String str2 = sc.nextLine();
			
			String s = ConcatenateStrings.concat(str1, str2) ;
		
			System.out.println("Original string 1 :" +str1 +" \nOriginal string 2 : " +str2) ;
			System.out.println("Concatenated String :" + s) ;
	}
}

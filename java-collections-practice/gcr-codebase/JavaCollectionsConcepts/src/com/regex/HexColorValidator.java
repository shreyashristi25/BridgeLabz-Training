package com.regex;
import java.util.* ;

public class HexColorValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking color code as user input and validating using regex
		System.out.println("Enter a hex color code : ") ;
		String color = sc.nextLine();
				
		String regex =  "^#[0-9A-Fa-f]{6}$" ;
				
		if(color.matches(regex)) {
			System.out.println(color +" is Valid!") ;
		}
		else {
			System.out.println(color +" is Invalid!") ;
		}
		
		sc.close();

	}

}

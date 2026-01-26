package com.regex;
import java.util.* ;

public class LicenseValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking plate number as user input and validating using regex
		System.out.println("Enter a license plate number : ") ;
		String plateNo = sc.nextLine();
		
		String regex =  "^[A-Z]{2}[0-9]{4}$" ;
		
		if(plateNo.matches(regex)) {
			System.out.println(plateNo +" is Valid!") ;
		}
		else {
			System.out.println(plateNo +" is Invalid!") ;
		}

		sc.close();
	}

}

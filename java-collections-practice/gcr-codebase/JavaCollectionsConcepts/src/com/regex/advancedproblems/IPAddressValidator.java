package com.regex.advancedproblems;
import java.util.* ;
import java.util.regex.* ;

public class IPAddressValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking ip address as user input and validating ip address
		System.out.println("Enter a IPV4 address : ") ;
		String ip = sc.nextLine() ;
		
		String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\." + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\." + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";


		if(ip.matches(regex)) {
			System.out.println(ip +" is Valid!") ;
		}
		else {
			System.out.println(ip +" is Invalid!") ;
		}
		
		sc.close();
		
	}

}

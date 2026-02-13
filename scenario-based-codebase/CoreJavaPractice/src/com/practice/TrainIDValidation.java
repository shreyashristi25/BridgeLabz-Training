package com.practice;
import java.util.* ;

public class TrainIDValidation {

	//method to validate Characters, number of seats booked and validate seat number
	public static boolean validateCharacters(String s) {
		if(s.length() ==  10) {
			return true ;
		}
		return false ;
	}
	
	public static boolean numericalValidation(String s) {
		
		if(Character.isDigit(s.charAt(5)) && Character.isDigit(s.charAt(6))  )
		{
			int seats = Integer.parseInt(s.substring(5, 7)) ;
			if(seats >= 1 && seats <= 10)
			return true ;
		}
		return false ;
	} 
	
	public static boolean alpbhabetValidation(String s) {
		if(Character.isAlphabetic(s.charAt(7)) && Character.isDigit(s.charAt(8)) && Character.isDigit(s.charAt(9))) {
			return true ;
		}
		return false ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;

		//taking input from user and displaying output accordingly
		System.out.println("Enter the Booking id : ") ;
		String id = sc.nextLine();
		
		if(!TrainIDValidation.validateCharacters(id)) {
			System.out.println("Invalid Input") ;
			return ;
		}
		else if(!TrainIDValidation.numericalValidation(id)) {
			System.out.println("Invalid Count") ;
			return ;
		}
		else if(!TrainIDValidation.alpbhabetValidation(id)) {
			System.out.println("Invalid Seat Number") ;
			return ;
		}
		
		int seat = Integer.parseInt(id.substring(5, 7) );
		System.out.println(seat) ;
		
		int seatNumber = Integer.parseInt(id.substring(8, 10) );
		System.out.println(seatNumber) ;
		
		for( int i =0; i < seat; i++) {
			System.out.println(id.charAt(7)+"" + seatNumber++);
		}
	}

}

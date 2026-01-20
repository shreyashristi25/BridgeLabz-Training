package com.stringmanipulation;
import java.util.* ;

//driver class for String Manipulation
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking word as user input
		System.out.println("Enter a word : ") ;
		String word = sc.next();
		
		//calling method and displaying result
		String result = Program.cleanseAndInvert(word) ;

		if(result != null) {
			System.out.println("The generated key is : " +result) ;
		}
		else {
			System.out.println("Invalid Input!") ;
		}
		sc.close();
	}

}

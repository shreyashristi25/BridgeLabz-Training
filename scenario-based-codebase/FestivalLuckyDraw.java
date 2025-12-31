/*Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.* ;
public class FestivalLuckyDraw {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in) ;
		
		//looping for multiple visitors 
		while(true) {
			System.out.println("--------Welcome to the Lucky Draw--------") ;
			System.out.println() ;
			System.out.println("1.Want to play ?") ;
			System.out.println("2.Exit") ;
			System.out.println("Enter your choice : ") ;
			int choice = sc.nextInt() ;
			
			//checking if the number is divisible by 3 and 5 or not and displaying whether a person wins or not 
			switch(choice) {
				case 1:
					System.out.println("Pick one card!") ;
					System.out.println("What's the number on your card?") ;
					int number = sc.nextInt() ;
				
					if(number > 0) {
						if(number % 3 == 0 && number % 5 == 0) {
							System.out.println("Congratulations! You won a lucky draw.") ;
						}
						else {
							System.out.println("Better Luck next time !") ;
						}
					}
		
					else {
						System.out.println("Invalid Input!") ;
						continue ;
					}
					break ;
				case 2 :
					System.out.println("Exiting the program......Thank you!") ;
					return ;
			}				
		}
		
	}
}
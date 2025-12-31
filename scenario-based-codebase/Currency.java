/*Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).*/

import java.util.* ;
public class Currency {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		char repeat ;
		
		//Asking for user's choice and looping until user says no for converting currency
		do{
			System.out.println("Enter the amount in INR :" ) ;
			double rupee =  sc.nextDouble() ;
		
			double money = 0.0;
			System.out.println("Currencies to which it can be exchanged :") ;
			System.out.println() ;
			System.out.println("1. Euro") ;
			System.out.println("2. US Dollar") ;
			System.out.println("3. British Pound") ;
			System.out.println("4. Japanese Yen") ;
			System.out.println("5. Australian Dollar") ;
			System.out.println();
			System.out.println("Choose the currency to which you want to convert :") ;
			int choice  = sc.nextInt () ;
		
			switch(choice) {
				case 1 :
					money = rupee*0.0095 ;
					System.out.println();
					System.out.println("INR " + rupee +" in Euro is : " +money) ;
					break ;
				case 2 :
					money = rupee*0.0111 ;
					System.out.println();
					System.out.println("INR " + rupee +" in US Dollor is : " +money) ;
					break ;
				case 3 :
					money = rupee * 0.0082 ;
					System.out.println();
					System.out.println("INR " + rupee +" in British Pound is : " +money) ;
					break ;
				case 4 :
					money = rupee * 1.74 ;
					System.out.println();
					System.out.println("INR " + rupee +" in Japanese Yen is : " +money) ;
					break ;
				case 5 :
					money = rupee * 0.0166 ;
					System.out.println();
					System.out.println("INR " + rupee +" in Australian Dollar is : " +money) ;
					break ;
			}
			
			System.out.println();
		    System.out.print("Do you want another conversion? (Y/N): ");
            repeat = sc.next().charAt(0);

        } 
		while (repeat == 'Y' || repeat == 'y');
		
		System.out.println();
        System.out.println("Thank you!");
        sc.close();
	
	}
}
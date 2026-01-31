package com.functionalinterfaces.digitalpayment;
import java.util.* ;

public class DigitalPayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;

		UPI upi = new UPI() ;
		CreditCard cc = new CreditCard() ;
		Wallet wallet = new Wallet() ;
		
		//taking user input for amount and payment mode and paying accordingly
		while(true) {
			System.out.println("Enter amount to pay : ") ;
			double amount = sc.nextDouble() ;
			sc.nextLine() ;
			System.out.println("Payment for " +amount +"$") ;
			
			System.out.println("Enter payemnt mode to pay (UPI/CreditCard/Wallet) : ") ;
			String choice = sc.nextLine() ;
		
			switch(choice.toLowerCase()) {
		
				case "upi" :
					upi.pay();
					break ;
				
				case "creditcard" :
					cc.pay();
					break ;
			
				case "wallet" :
					wallet.pay();
					break ;
			
				default :
					upi.pay();
					break ;
			}
		}
	}

}

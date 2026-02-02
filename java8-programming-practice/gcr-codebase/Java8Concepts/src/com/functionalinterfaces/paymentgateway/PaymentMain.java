package com.functionalinterfaces.paymentgateway;
import java.util.* ;

public class PaymentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking user choice as input and displaying result accordingly
        System.out.println("=== Payment Gateway Integration ===");
        System.out.println("Choose provider:");
        System.out.println("1. PayPal");
        System.out.println("2. Stripe");
        System.out.println("Enter your choice  : ") ;
        
        int choice = sc.nextInt();
        sc.nextLine(); 

        PaymentProcessor processor;

        if (choice == 1) {
            processor = new PayPalProcessor();
            
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            
            System.out.println("Choose action:");
            System.out.println("1. Process Payment");
            System.out.println("2. Refund");
            System.out.println("Enter your choice : ") ;
            
            int action = sc.nextInt();

            if (action == 1) {
                processor.processPayment(amount);
            }
            else if (action == 2) {
                processor.refund(amount);
            }
            else {
                System.out.println("Invalid action!");
            }

        }
        else if (choice == 2) {
            processor = new StripeProcessor();
            
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            sc.nextLine() ;
            
            System.out.println("Choose action:");
            System.out.println("1. Process Payment");
            System.out.println("2. Refund");
            System.out.println("Enter your choice  : ") ;
            
            int action = sc.nextInt();

            if (action == 1) {
                processor.processPayment(amount);
            }
            else if (action == 2) {
                processor.refund(amount);
            }
            else {
                System.out.println("Invalid action!");
            }
        } 
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
    
        sc.close();


	}

}

package com.exceptionhandling.banktransactionsystem;
import java.util.* ;

public class BankTransactionSystem {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	     try {
	         //taking user input and handling exception 
	    	 System.out.print("Enter initial balance: ");
	         double initialBalance = sc.nextDouble();

	         Account account = new Account(initialBalance);

	         System.out.print("Enter withdrawal amount: ");
	         double amount = sc.nextDouble();

	         account.withdraw(amount);

	     }
	     catch (InsufficientBalanceException e) {
	    	 System.out.println(e.getMessage());
	     }
	     catch (IllegalArgumentException e) {
	    	 System.out.println(e.getMessage());
	     }
	     catch (Exception e) {
	    	 System.out.println("Invalid input!");
	     }
	     finally {
	    	 sc.close();
	     }
	}

}

package com.constructor.level1;

//creating driver class for BankAccount class
public class BankMain {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(101, "Shruti", 5000.0);
        acc1.displayAccountDetails();

        acc1.deposit(2000);
        acc1.withdraw(1500);

        SavingsAccount sav1 = new SavingsAccount(201, "Amit", 10000.0, 5.0);
        sav1.displaySavingsDetails();

	}

}

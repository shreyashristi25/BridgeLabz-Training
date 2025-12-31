package com.inheritance.hierarchical;

//driver class for all classes
public class BankMain {

	public static void main(String[] args) {

		// Create different account objects and display bank info
        BankAccount acc1 = new SavingsAccount("SA123", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA456", 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount("FD789", 100000, 12);

        acc1.displayInfo();
        acc1.displayAccountType();
        System.out.println("-------------------");

        acc2.displayInfo();
        acc2.displayAccountType();
        System.out.println("-------------------");

        acc3.displayInfo();
        acc3.displayAccountType();


	}

}

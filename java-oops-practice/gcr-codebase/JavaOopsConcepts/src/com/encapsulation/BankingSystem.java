package com.encapsulation;

public class BankingSystem {

	public static void main(String[] args) {

		// Array of accounts (no collections)
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("SA123456", "Alice", 6000);
        accounts[1] = new CurrentAccount("CA987654", "Bob", 12000);

        // Polymorphism: process accounts dynamically
        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());

            // Downcast to Loanable
            Loanable loanAcc = (Loanable) acc;
            loanAcc.applyForLoan(5000);
            System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
            System.out.println("-----------------------------------");
        }


	}

}

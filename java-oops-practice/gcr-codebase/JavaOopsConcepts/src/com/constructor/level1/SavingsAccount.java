package com.constructor.level1;

public class SavingsAccount extends BankAccount{
	
	private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method showing access to public and protected members
    public void displaySavingsDetails() {
        System.out.println("Savings Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "%");
    }

}

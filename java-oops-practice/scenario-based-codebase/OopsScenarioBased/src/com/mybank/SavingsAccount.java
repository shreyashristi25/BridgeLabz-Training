package com.mybank;

//creating SavingsAccount as a subclass of Account class
public class SavingsAccount extends Account{
	private double interestRate = 4.0; 

	//constructors for SavingsAccount class with and without openingBalance
    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

	

}

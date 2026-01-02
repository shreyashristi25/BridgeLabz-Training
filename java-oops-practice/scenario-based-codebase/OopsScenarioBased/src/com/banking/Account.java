package com.banking;

public abstract class Account {

	protected double balance;
    protected String accountNumber;

    //constructor
    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //getter methods to get balance, account number 
    public double getBalance() { 
    	return balance; 
    }
    
    public String getAccountNumber() { 
    	return accountNumber; 
    }

    //abstract method to check loan eligibility
    public abstract boolean checkLoanEligibility();
    
    //method to display account info
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
    }


}

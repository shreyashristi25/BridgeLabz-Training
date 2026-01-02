package com.banking;
//creating SavingsAccount as a subclass of Account class
public class SavingsAccount extends Account{

	private double interestRate;

	//constructor
    public SavingsAccount(double balance, String accountNumber, double interestRate) {
        super(balance, accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    public boolean checkLoanEligibility() {
        // Example: Eligible if balance > 5000 and interestRate > 3%
        return balance > 5000 && interestRate > 3.0;
       
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
    }


}

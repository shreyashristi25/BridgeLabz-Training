package com.banking;

//creating CurrentAccount class as subclass  of Account class
public class CurrentAccount extends Account{

	private double overdraftLimit;

	//constructor
    public CurrentAccount(double balance, String accountNumber, double overdraftLimit) {
        super(balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean checkLoanEligibility() {
        // Example: Eligible if overdraftLimit > 2000
        return overdraftLimit > 2000;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
    }


}

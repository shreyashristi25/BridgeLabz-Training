package com.exceptionhandling.banktransactionsystem;

public class Account {

	private double balance;

	//constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // method to withdraw handling exception
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
           
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

}

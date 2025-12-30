package com.objectmodeling;

public class Account {

	private int accountNumber;
    private double balance;
    private Bank bank;  

    // Constructor of Account class 
    public Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; 
        this.bank = bank;
    }

    // creating methods to Deposit and Withdraw money
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Getter methods to get balance and account number
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }
}



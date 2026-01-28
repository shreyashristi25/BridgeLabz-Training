package com.junit.main.banksystem;

public class BankAccount {

	private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //methods to deposit money, withdraw money and check balance
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}

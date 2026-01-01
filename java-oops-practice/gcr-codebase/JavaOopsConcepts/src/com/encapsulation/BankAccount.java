package com.encapsulation;

public abstract class BankAccount {
    private String accountNumber;  
    private String holderName;
    protected double balance;

    //constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    //getters to get account number, holder name and balance
    public String getAccountNumber() {
        return " " + accountNumber.substring(accountNumber.length() - 4);
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    //methods to deposit and withdraw money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance for " + holderName);
        }
    }

    // Abstract method
    public abstract double calculateInterest();
}



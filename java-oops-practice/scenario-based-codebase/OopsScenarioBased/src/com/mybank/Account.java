package com.mybank;

//creating Account class that implements ITransaction interface
public abstract class Account implements ITransaction{

	// Private variables for encapsulation
    private String accountNumber;
    private double balance;

    // Constructors of Account class with and without opening balance
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public Account(String accountNumber) {
        this(accountNumber, 0.0);
    }

    // accessing private balance, in a protected scope
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    //overriden transaction methods
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Receipt] Deposited: " + amount + 
                               " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("[Receipt] Withdrawn: " + amount + 
                               " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // Abstract method 
    public abstract double calculateInterest();

    // Method to display account details
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber + 
                           " | Account Balance: " + balance);
    }
}

	


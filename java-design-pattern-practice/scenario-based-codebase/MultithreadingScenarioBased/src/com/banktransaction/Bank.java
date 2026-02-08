package com.banktransaction;
import java.util.* ;

public class Bank {

	private Map<Integer, Integer> accounts = new HashMap<>();

    // Initialize accounts with balances
    public Bank(int numberOfAccounts, int initialBalance) {
        for (int i = 1; i <= numberOfAccounts; i++) {
            accounts.put(i, initialBalance);
        }
    }

    // Deposit method - synchronized to ensure thread safety
    public synchronized void deposit(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);
        balance += amount;
        accounts.put(accountNumber, balance);
        System.out.println("Deposited " + amount + " into Account-" + accountNumber +
                           " | New Balance: " + balance);
    }

    // Withdraw method - synchronized to ensure thread safety
    public synchronized void withdraw(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);
        if (balance >= amount) {
            balance -= amount;
            accounts.put(accountNumber, balance);
            System.out.println("Withdrew " + amount + " from Account-" + accountNumber +
                               " | New Balance: " + balance);
        } else {
            System.out.println("Withdrawal of " + amount + " from Account-" + accountNumber +
                               " failed | Insufficient Balance: " + balance);
        }
    }


    // Get balance method
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }

}

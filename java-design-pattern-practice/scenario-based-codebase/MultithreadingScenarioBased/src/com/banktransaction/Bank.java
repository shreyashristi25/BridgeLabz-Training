package com.banktransaction;
import java.util.HashMap;
import java.util.Map;

class Bank {

    private final Map<Integer, Integer> accounts = new HashMap<>();

    //method to add account
    public synchronized void addAccount(int accNo, int balance) {
        accounts.put(accNo, balance);
    }

    //methods to deposit and withdraw from account
    public synchronized void deposit(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);
        balance += amount;
        accounts.put(accountNumber, balance);

        System.out.println(Thread.currentThread().getName() +
                " deposited " + amount +
                " → Account " + accountNumber +
                " Balance: " + balance);
    }

    public synchronized void withdraw(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);

        if (balance >= amount) {
            balance -= amount;
            accounts.put(accountNumber, balance);

            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount +
                    " → Account " + accountNumber +
                    " Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " attempted withdrawal of " + amount +
                    " → Insufficient balance in Account " + accountNumber);
        }
    }

    //methods to get balance and print all balances
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public synchronized void printAllBalances() {
        System.out.println("\nFinal Account Balances:");
        accounts.forEach((acc, bal) ->
                System.out.println("Account " + acc + " → " + bal));
    }
}



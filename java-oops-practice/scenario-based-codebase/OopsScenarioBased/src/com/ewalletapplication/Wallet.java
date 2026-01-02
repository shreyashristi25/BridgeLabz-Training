package com.ewalletapplication;
import java.util.* ;

//creating class wallet as a subclass that implements Transferrable inetrface
public abstract class Wallet implements Transferrable{

	private double balance;
    private List<Transaction> transactions;

    //constructor
    public Wallet(double initialBalance, double referralBonus) {
        this.balance = initialBalance + referralBonus;
        this.transactions = new ArrayList<>();
    }

    //getter method to get balance
    public double getBalance() {
        return balance;
    }

    //methods to add transaction, load money, deduct money and view transaction
    protected void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void loadMoney(double amount) {
        balance += amount;
        addTransaction(new Transaction(amount, "Credit"));
    }

    protected void deduct(double amount) {
        balance -= amount;
        addTransaction(new Transaction(amount, "Debit"));
    }

    public void viewTransactions() {
        for (Transaction t : transactions) {
            t.displayInfo();
        }
    }

}

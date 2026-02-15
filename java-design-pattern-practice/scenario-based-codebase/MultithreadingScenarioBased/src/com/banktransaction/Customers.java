package com.banktransaction;

public class Customers extends Thread {

	private Bank bank;
    private int accountNumber;
    private int depositAmount;
    private int withdrawAmount;

    //constructor
    public Customers(String name, Bank bank, int accountNumber,
                    int depositAmount, int withdrawAmount) {
        super(name);
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        bank.deposit(accountNumber, depositAmount);
        bank.withdraw(accountNumber, withdrawAmount);
    }
}

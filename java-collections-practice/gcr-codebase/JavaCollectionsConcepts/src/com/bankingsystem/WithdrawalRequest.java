package com.bankingsystem;

public class WithdrawalRequest {

	public int accountNumber;
    public double amount;

    //constructor
    public WithdrawalRequest(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    //getter methods to get account number and amount
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

}

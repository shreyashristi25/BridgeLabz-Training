package com.ewalletapplication;
import java.util.* ;
public class Transaction {

	private static int counter = 1;
    private int transactionId;
    private double amount;
    private String type;
    private Date timestamp;

    public Transaction(double amount, String type) {
        this.transactionId = counter++;
        this.amount = amount;
        this.type = type;
        this.timestamp = new Date();
    }

    public void displayInfo() {
        System.out.println("Transaction ID: " + transactionId +
                           " | Type: " + type +
                           " | Amount: " + amount +
                           " | Date: " + timestamp);
    }

}

package com.multithreading.bankingsystem;
import java.util.* ;
import java.text.SimpleDateFormat;
public class BankAccount {

	private int balance = 10000 ;
	
	//method to ensure thread-safe withdrawals
	public synchronized boolean withdraw(String customer, int amount) {
        System.out.println("[" + customer + "] Attempting to withdraw " + amount);

        if (amount <= balance) {
            balance -= amount;
            String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
            System.out.println("Transaction successful: " + customer + 
                               ", Amount: " + amount + 
                               ", Balance: " + balance + 
                               ", Time: " + timeStamp);
            return true;
        } 
        else {
            String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
            System.out.println("Transaction failed: " + customer + 
                               ", Amount: " + amount + 
                               ", Balance: " + balance + 
                               ", Time: " + timeStamp);
            return false;
        }
    }

	
}

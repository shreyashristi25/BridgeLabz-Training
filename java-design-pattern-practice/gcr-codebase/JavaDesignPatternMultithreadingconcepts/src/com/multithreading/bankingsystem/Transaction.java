package com.multithreading.bankingsystem;
import java.util.* ;

public class Transaction implements Runnable{

	private BankAccount account ;
	private String customerName ;
	private int amount  ;
	private Random random = new Random() ;
	
	//constructor
	public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }


	@Override
	public void run() {
		try {
			Thread.sleep(random.nextInt());
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		account.withdraw(customerName, amount) ;
	}
}

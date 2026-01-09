package com.artify;

public class User {

	//private variables to ensure limited access
	private String name ;
	private double walletBalance ;
	
	//constructor
	public User(String name, double walletBalance) {
		this.name = name ;
		this.walletBalance = walletBalance ;		
	}
	
	//method to get name and deductBalance and showBalance 
	public String getName() {
		return name ;
	}
	
	public void deductBalance(double amount) {
		if(walletBalance >= amount) {
			walletBalance -= amount ;
		}
		else {
			System.out.println("Insufficient Balance!") ;
		}
	}
	
	public void showBalance() {
        System.out.println(name + "'s Wallet Balance: $" + walletBalance);
    }

}

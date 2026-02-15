package com.BankManagement;

public class Account {

	String name ; 
	double balance ;
	
	//constructor
	public Account(String name, double balance) {
		this.name = name; 
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return name + " - Balance: " + balance ; 
	}
}

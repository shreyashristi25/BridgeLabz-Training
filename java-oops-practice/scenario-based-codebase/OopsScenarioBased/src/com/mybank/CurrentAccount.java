package com.mybank;

//creating CurrentAccount as a subclass of Account class 
public class CurrentAccount extends Account{
	private double interestRate = 2.0 ;
	
	//constructors for CurrentAccount class with and without openingBalance 
	public CurrentAccount(String accountNumber, double openingBalance) {
		super(accountNumber, openingBalance) ;
	} 
	
	public CurrentAccount(String accountNumber) {
		super(accountNumber) ;
	}
	
	@Override
	public double calculateInterest() {
		return getBalance()* interestRate /100 ;
	}
}

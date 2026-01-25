package com.exceptionhandling.banktransactionsystem;

//creating class to define custom exception
public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String message) {
		super(message) ;
	}
}

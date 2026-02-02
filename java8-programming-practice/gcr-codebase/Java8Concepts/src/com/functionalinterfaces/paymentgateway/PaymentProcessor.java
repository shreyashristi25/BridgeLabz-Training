package com.functionalinterfaces.paymentgateway;

public interface PaymentProcessor {

	//creating a paymentProcessing method  and a default method for refund
	void processPayment(double amount) ;
	
	default void refund(double amount) {
		System.out.println("Refund of " +amount +" is not supported.") ;
	}
}

package com.functionalinterfaces.paymentgateway;

public class StripeProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Stripe Payement..") ;
	}
	
	@Override
	public void refund(double amount) {
		System.out.println("Refunding $" + amount +" via stripe.") ;
	} 
}

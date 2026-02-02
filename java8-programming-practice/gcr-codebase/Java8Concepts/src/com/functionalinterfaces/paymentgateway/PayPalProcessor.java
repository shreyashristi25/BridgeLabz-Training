package com.functionalinterfaces.paymentgateway;

public class PayPalProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing paypal payment..") ;
	}
}

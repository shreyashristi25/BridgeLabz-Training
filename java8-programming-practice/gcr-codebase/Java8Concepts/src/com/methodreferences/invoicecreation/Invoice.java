package com.methodreferences.invoicecreation;

public class Invoice {

	String transactionId ;
	
	public Invoice(String transactionId) {
		this.transactionId = transactionId ;		
	}
	
	@Override
	public String toString() {
		return "Invoice generated for the payment with transaction ID : " + transactionId ;
	}
}

package com.functionalinterfaces.digitalpayment;

public class UPI implements Payable{

	@Override 
	public void pay() {
		System.out.println("Payment Done Using UPI") ;
	}
}

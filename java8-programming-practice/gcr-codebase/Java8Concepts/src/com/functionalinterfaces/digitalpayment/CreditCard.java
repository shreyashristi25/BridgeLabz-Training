package com.functionalinterfaces.digitalpayment;

public class CreditCard implements Payable{

	@Override
	public void pay() {
		System.out.println("Payment Done using Credit card") ;
	}
}

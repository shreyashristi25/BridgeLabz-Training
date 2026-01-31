package com.functionalinterfaces.digitalpayment;

public class Wallet implements Payable{

	@Override
	public void pay() {
		System.out.println("Payment Done using Wallet") ;
	}
}

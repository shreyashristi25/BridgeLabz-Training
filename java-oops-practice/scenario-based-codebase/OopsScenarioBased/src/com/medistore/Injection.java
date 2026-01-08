package com.medistore;

import java.time.LocalDate;
//creating Injection as subclass of Medicine class
public class Injection extends Medicine{

	//constructor
	public Injection(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity) ;
	}
	
	@Override
	public boolean checkExpiry() {
		return getExpiryDate().isBefore(LocalDate.now().plusMonths(1)) ;
	}
}

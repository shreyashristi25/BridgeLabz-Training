package com.medistore;
import java.time.LocalDate ;

//creating tablet as subclass of medicine class
public class Tablet extends Medicine{

	//constructor
	public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity) ;
	}
	
	@Override
	public boolean checkExpiry() {
		return getExpiryDate().isBefore(LocalDate.now().plusMonths(12)) ;
	}
}

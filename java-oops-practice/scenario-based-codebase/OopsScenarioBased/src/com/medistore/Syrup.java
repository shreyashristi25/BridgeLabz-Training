package com.medistore;
import java.time.LocalDate;

//creating Syrup as subclass of Medicine class
public class Syrup extends Medicine{

	//constructor
	public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity) ;
	}
	
	@Override
	public boolean checkExpiry() {
		return getExpiryDate().isBefore(LocalDate.now().plusMonths(1)) ;
	}
}

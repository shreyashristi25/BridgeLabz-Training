package com.payxpress;

import java.time.LocalDate;

//creating ElectricityBill as subclass of Bill
public class WaterBill extends Bill {

	//constructor
	public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }
	
	@Override
	public void pay() {
		markPaid() ;
		System.out.println("Water Bill paid!") ;
	}
	
	@Override
	public void sendReminder() {
		System.out.println("Reminder : Water Bill Due!!") ;
	}
}

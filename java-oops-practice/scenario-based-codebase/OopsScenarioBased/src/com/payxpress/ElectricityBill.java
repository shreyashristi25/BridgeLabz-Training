package com.payxpress;
import java.time.* ;

//creating ElectricityBill as subclass of Bill
public class ElectricityBill extends Bill{

	//constructor
	public ElectricityBill(double amount, LocalDate dueDate) {
		super("Water", amount, dueDate) ;
	}
	
	@Override
	public void pay() {
		markPaid() ;
		System.out.println("Electricity Bill paid!") ;
	}
	
	@Override
	public void sendReminder() {
		System.out.println("Reminder : Electricity Bill Due!!") ;
	}
}

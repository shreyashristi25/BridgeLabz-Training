package com.payxpress;
import java.time.* ;

//creating InternetBill as subclass of Bill
public class InternetBill extends Bill{

	//constructor
	public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

	@Override
	public void pay() {
		markPaid() ;
		System.out.println("Internet Bill paid!") ;
	}
	
	@Override
	public void sendReminder() {
		System.out.println("Reminder : Internet Bill Due!!") ;
	}
}

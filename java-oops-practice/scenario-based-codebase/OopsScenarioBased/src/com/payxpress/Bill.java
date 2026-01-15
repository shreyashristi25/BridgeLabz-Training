package com.payxpress;
import java.time.* ;
public abstract class Bill implements IPayable{

	//private variables to ensure limited access
	protected String type;
	protected double amount ;
	protected LocalDate dueDate ;
	private boolean isPaid ;
	
	//constructor
	public Bill(String type, double amount, LocalDate dueDate) {
		this.type = type ;
		this.amount = amount ;
		this.dueDate =  dueDate ;
		this.isPaid = false;
	}
	
	//getter method to get paid status and methods to mark paid, calculate late fees and display info

	public boolean getPaid() {
		return isPaid ;
	}
	protected void markPaid() {
		this.isPaid = true ;
	}
	
	public double calculateLateFees(double penaltyAmount) {
		return this.amount+ penaltyAmount ;
	}
	
	public String getDetails() {
		return type + "Bill :  Amount= " +amount + ", Due Date= " +dueDate +", Paid ? = " + isPaid ;
	}
}

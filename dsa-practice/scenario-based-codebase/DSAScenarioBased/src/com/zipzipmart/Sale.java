package com.zipzipmart;

public class Sale {

	String branch ;
	String date ;
	double amount ;
	
	//constructor
	public Sale(String branch, String date, double amount) {
		this.branch = branch ;
		this.date  = date ;
		this.amount = amount ;
	}
	
	@Override
	public String toString() {
		return branch + " | " + date + " | " + amount;
	}
}

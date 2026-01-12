package com.budgetwise ;
import java.util.* ;
import java.time.* ;

public class Transaction {

	//private and protected variables to ensure limited access
	private double amount;
    private String type;    
    private Date date;
    private String category;

    //constructor
    public Transaction(double amount, String type, Date date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    //getter methods to get amount, type, date, category
    public double getAmount() {
    	return amount; 
    }
    public String getType() {
    	return type; 
    }
    public Date getDate() {
    	return date; 
    }
    public String getCategory() {
    	return category; 
    }

}

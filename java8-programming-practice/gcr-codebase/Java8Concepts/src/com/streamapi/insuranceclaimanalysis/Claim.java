package com.streamapi.insuranceclaimanalysis;

public class Claim {

	private String claimType ;
	private double amount ;
	
	//constructor
	public Claim(String claimType, double amount ) {
		this.claimType = claimType ;
		this.amount = amount ;
	}
	
	//getter methods to get claimType and amount
	public String getClaimType() {
		return claimType ;
	}
	
	public double getAmount() {
		return amount  ;
	}
	@Override 
	public String toString() {
		return claimType +" : " + amount ;
 	}
 }

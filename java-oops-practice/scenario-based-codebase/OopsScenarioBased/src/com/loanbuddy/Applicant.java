package com.loanbuddy;

public class Applicant {

	//private  variables to ensure limited access 
	private String name ;
	private int creditScore ;
	private  double income ;
	private double loanAmount ;
	
	//constructor
	public Applicant (String name, int creditScore, double income, double loanAmount) {
		this.name = name ;
		this.creditScore = creditScore ;
		this.income = income ;
		this.loanAmount = loanAmount ;
		
	}
	
	//getter methods to get name, credit score, income and loan amount
	public String getName () {
		return name;
	}
	
	public double getIncome () {
		return income;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public int getCreditScoreInternal() { 
		return creditScore; 
	}
	

}

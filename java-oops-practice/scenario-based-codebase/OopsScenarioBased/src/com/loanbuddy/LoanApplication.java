package com.loanbuddy;

public abstract class LoanApplication implements  IApprovable{

	//private variables to ensure limited access
	private String loanType;
    private int termMonths;
    private double interestRate;
    private boolean approved;   

    //constructor
    public LoanApplication(String loanType, int termMonths, double interestRate) {
        this.loanType = loanType;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
        this.approved = false;
    }

    //getter methods to access loan type, term months, interest rate and approval
    public String getLoanType() { 
    	return loanType;
    }
    public int getTermMonths() {
    	return termMonths; 
    }
    public double getInterestRate() { 
    	return interestRate; 
    }
    public boolean isApproved() {
    	return approved; 
    }

    // setter method to modify approval status
    protected void setApproved(boolean status) { 
    	this.approved = status; 
    }
    
    //method to calculate EMI
    protected double standardEmi(double principal) {
        double R = (interestRate / 100.0) / 12.0;
        int N = termMonths;
        double pow = Math.pow(1 + R, N);
        return principal * R * pow / (pow - 1);
    }

    // abstract methods
    public abstract boolean approveLoan(Applicant applicant);
    public abstract double calculateEMI(double principal);

}

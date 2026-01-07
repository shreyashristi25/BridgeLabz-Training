package com.loanbuddy;

//creating HomeLoan as a subclass of LoanApplication
public class HomeLoan extends LoanApplication{

	//constructor
	public HomeLoan(int termMonths, double interestRate) {
        super("Home", termMonths, interestRate);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        boolean eligible = applicant.getCreditScoreInternal() >= 700;
        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI(double principal) {
        return standardEmi(principal);
    }

}

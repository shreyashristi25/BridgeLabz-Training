package com.loanbuddy;

//creating AutoLoan as subclass of LoanApplication
public class AutoLoan extends LoanApplication{

	//constructor
	public AutoLoan(int termMonths, double interestRate) {
        super("Auto", termMonths, interestRate);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        boolean eligible = applicant.getCreditScoreInternal() >= 660;
        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI(double principal) {
        return standardEmi(principal);
    }

}

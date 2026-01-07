package com.loanbuddy;

//creating PersonalLoan as subclass of LoanApplication
public class PersonalLoan extends LoanApplication{

	//constructor
	public PersonalLoan(int termMonths, double interestRate) {
        super("Personal", termMonths, interestRate);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        boolean eligible = applicant.getCreditScoreInternal() >= 680;
        setApproved(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI(double principal) {
        return standardEmi(principal);
    }

}

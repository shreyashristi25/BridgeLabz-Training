package com.functionalinterface.customfunctionalinterface;

@FunctionalInterface
public interface LoanEligibility {

	 boolean check(double income, double loanAmount);

}

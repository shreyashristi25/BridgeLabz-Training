package com.encapsulation;

//creating CurrentAccount as suubclass of BankAccount
public class CurrentAccount extends BankAccount implements Loanable{

	//constructor
	public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

	//overriden methods of BankAccount class
    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for loan of: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 10000; // stricter eligibility
    }

}

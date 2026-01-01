package com.encapsulation;

//creating SavingsAccount as subclass of Bank Account
public class SavingsAccount extends BankAccount implements Loanable{

	//constructor
	public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

	//overriden methods of BnkAccount class
    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for loan of: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 5000; // eligible if balance >= 5000
    }

}

package com.inheritance.hierarchical;

//creating FixedDepositAccount as subclass for BankAccount
public class FixedDepositAccount extends BankAccount{

	int maturityPeriod;

	//constructor
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }

}

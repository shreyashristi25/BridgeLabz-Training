package com.inheritance.hierarchical;

//creating SavingAccount as subclass of BankAccount
public class SavingsAccount extends BankAccount{

	double interestRate;

	//constructor
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }

}

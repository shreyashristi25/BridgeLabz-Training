package com.inheritance.hierarchical;

//creating CheckingAccount as subclass for BankAccount
public class CheckingAccount extends BankAccount{

	double withdrawalLimit;

	//constructor
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }

}

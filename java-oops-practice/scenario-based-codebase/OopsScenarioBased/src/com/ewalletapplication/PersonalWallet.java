package com.ewalletapplication;

//creating PersonWallet as a subclass of Wallet
public class PersonalWallet extends Wallet{

	 private static final double TAX = 0.02; 

	    //constructor
	    public PersonalWallet(double initialBalance, double referralBonus) {
	        super(initialBalance, referralBonus);
	    }

	    @Override
	    public void transferTo(User receiver, double amount) {
	        double taxAmount = amount * TAX;
	        double totalDeduction = amount + taxAmount;
	        if (getBalance() >= totalDeduction) {
	            deduct(totalDeduction);
	            receiver.getWallet().loadMoney(amount);
	            System.out.println("Transferred " + amount + " with tax " + taxAmount + " from PersonalWallet.");
	        } else {
	            System.out.println("Insufficient balance in PersonalWallet.");
	        }
	    }

}

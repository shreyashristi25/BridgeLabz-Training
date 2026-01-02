package com.ewalletapplication;

//creating BusinessWallet as a subclass of Wallet class
public class BusinessWallet extends Wallet{

	private static final double SURCHARGE = 50; 

	//constructor
    public BusinessWallet(double initialBalance, double referralBonus) {
        super(initialBalance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double totalDeduction = amount + SURCHARGE;
        if (getBalance() >= totalDeduction) {
            deduct(totalDeduction);
            receiver.getWallet().loadMoney(amount);
            System.out.println("Transferred " + amount + " with surcharge " + SURCHARGE + " from BusinessWallet.");
        } else {
            System.out.println("Insufficient balance in BusinessWallet.");
        }
    }

}

package com.ewalletapplication;

//driver class for other classes in E-Wallet Application
public class EWallet {

	public static void main(String[] args) {
        User u1 = new User(1, "Shruti", new PersonalWallet(1000, 100));
        User u2 = new User(2, "Adya", new BusinessWallet(5000, 0));

        u1.getWallet().loadMoney(500);
        u1.getWallet().transferTo(u2, 300);

        u1.viewTransactions();
        u2.viewTransactions();
    }
}



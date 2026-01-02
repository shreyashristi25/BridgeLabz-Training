package com.ewalletapplication;

public class User {

	private int id;
    private String name;
    private Wallet wallet;

    //constructor
    public User(int id, String name, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    //method to view transaction
    public void viewTransactions() {
        System.out.println("Transaction history for " + name + ":");
        wallet.viewTransactions();
    }

}

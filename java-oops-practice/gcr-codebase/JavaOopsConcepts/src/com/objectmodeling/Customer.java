package com.objectmodeling;
import java.util.ArrayList;

public class Customer {

	private String name;
    private ArrayList<Account> accounts;

    // Constructor of Customer class 
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add account to customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View balances of all accounts
    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber() +" at " + acc.getBank().getName() +" has balance: " + acc.getBalance());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

}

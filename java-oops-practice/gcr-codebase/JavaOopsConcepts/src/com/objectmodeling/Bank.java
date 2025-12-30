package com.objectmodeling;
import java.util.ArrayList;

public class Bank {

	private String name;
    private ArrayList<Customer> customers;
    private int nextAccountNumber = 1001; // auto-generate account numbers

    // Constructor of Bank class 
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // creating method to Open account for a customer
    public Account openAccount(Customer customer) {
        Account newAccount = new Account(nextAccountNumber++, this);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account " + newAccount.getAccountNumber() +" opened for " + customer.getName() +" at " + name);
        return newAccount;
    }

    public String getName() {
        return name;
    }

}

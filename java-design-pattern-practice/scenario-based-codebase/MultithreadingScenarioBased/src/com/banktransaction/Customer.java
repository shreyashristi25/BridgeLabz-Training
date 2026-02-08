package com.banktransaction;
import java.util.* ;

public class Customer extends Thread {

	private int customerId;
    private Bank bank;
    private int accountNumber;
    private List<String> transactions;

    //constructor
    public Customer(int customerId, Bank bank, int accountNumber, List<String> transactions) {
        super("Customer-" + customerId);
        this.customerId = customerId;
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.transactions = transactions;
    }

    @Override
    public void run() {
        for (String tx : transactions) {
            String[] parts = tx.split(" ");
            String type = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (type.equalsIgnoreCase("deposit")) {
                bank.deposit(accountNumber, amount);
            } else if (type.equalsIgnoreCase("withdraw")) {
                bank.withdraw(accountNumber, amount);
            }
        }
        System.out.println(getName() + " final balance in Account-" + accountNumber +
                           ": " + bank.getBalance(accountNumber));
    }

}

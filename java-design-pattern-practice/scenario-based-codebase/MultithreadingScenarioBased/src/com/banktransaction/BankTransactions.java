package com.banktransaction;
import java.util.* ;

public class BankTransactions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Setup bank
        System.out.print("Enter number of accounts: ");
        int numAccounts = sc.nextInt();
        System.out.print("Enter initial balance for each account: ");
        int initialBalance = sc.nextInt();
        sc.nextLine(); 

        Bank bank = new Bank(numAccounts, initialBalance);

        // Setup customers
        System.out.print("Enter number of customers: ");
        int numCustomers = sc.nextInt();
        sc.nextLine();

        Customer[] customers = new Customer[numCustomers];

        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter account number for Customer-" + (i+1) + ": ");
            int accountNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter number of transactions for Customer-" + (i+1) + ": ");
            int numTx = sc.nextInt();
            sc.nextLine();

            List<String> transactions = new ArrayList<>();
            for (int j = 0; j < numTx; j++) {
                System.out.print("Enter transaction " + (j+1) + " (format: deposit 2000 or withdraw 1500): ");
                transactions.add(sc.nextLine());
            }

            customers[i] = new Customer(i+1, bank, accountNumber, transactions);
        }

        // Start customer threads
        for (Customer c : customers) {
            c.start();
        }

        // Wait for all customers to finish
        for (Customer c : customers) {
            try {
                c.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display final balances
        System.out.println("\nFinal Balances:");
        for (int i = 1; i <= numAccounts; i++) {
            System.out.println("Account-" + i + ": " + bank.getBalance(i));
        }

        sc.close();




	}

}

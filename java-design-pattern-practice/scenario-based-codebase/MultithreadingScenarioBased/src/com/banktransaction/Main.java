package com.banktransaction;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter account number: ");
            int acc = sc.nextInt();

            System.out.print("Enter initial balance: ");
            int bal = sc.nextInt();

            bank.addAccount(acc, bal);
        }

        System.out.print("\nEnter number of customers (threads): ");
        int c = sc.nextInt();

        List<Customers> customers = new ArrayList<>();

        for (int i = 0; i < c; i++) {

            System.out.println("\nCustomer " + (i + 1));

            System.out.print("Enter account number: ");
            int acc = sc.nextInt();

            System.out.print("Deposit amount: ");
            int dep = sc.nextInt();

            System.out.print("Withdraw amount: ");
            int wit = sc.nextInt();

            customers.add(new Customers("Customer-" + (i + 1),
                    bank, acc, dep, wit));
        }

        // Start threads
        customers.forEach(Thread::start);

        // Wait for completion
        for (Customers cust : customers) {
            try {
                cust.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        bank.printAllBalances();
    }
}


package com.bankingsystem;
import java.util.* ;
public class BankingSystemMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BankingSystem bank = new BankingSystem();

        // Take user input for accounts and their details
        System.out.println("Enter number of accounts:");
        int accCount = sc.nextInt();

        for (int i = 0; i < accCount; i++) {
            System.out.print("Enter account number: ");
            int accNum = sc.nextInt();
            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();
            bank.addAccount(accNum, balance);
        }

        // Displaying accounts sorted by balance
        bank.displayingAccountsSortedByBalance();

        // Taking withdrawal requests as user input
        System.out.println("Enter number of withdrawal requests:");
        int reqCount = sc.nextInt();

        for (int i = 0; i < reqCount; i++) {
            System.out.print("Enter account number for withdrawal: ");
            int accNum = sc.nextInt();
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            bank.requestWithdrawal(accNum, amount);
        }

        // Processing withdrawals and displaying updated balance
        bank.processWithdrawals();

        bank.displayingAccountsSortedByBalance();


	}

}

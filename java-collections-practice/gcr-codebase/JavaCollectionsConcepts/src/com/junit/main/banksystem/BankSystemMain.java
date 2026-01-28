package com.junit.main.banksystem;
import java.util.* ;

public class BankSystemMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(100.0); 

        //taking user input, calling methods and displaying result accordingly
        int choice;
        do {
            System.out.println("--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    try {
                        account.deposit(depositAmount);
                        System.out.println("Deposited successfully!");
                    }
                    catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawn successfully!");
                    } 
                    catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();

	}

}

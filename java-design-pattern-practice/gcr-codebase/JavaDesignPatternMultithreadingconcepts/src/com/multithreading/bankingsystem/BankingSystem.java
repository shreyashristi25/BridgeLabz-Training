package com.multithreading.bankingsystem;
import java.util.*  ;
public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        //taking number of transactions as user input and printing results accordingly
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Thread[] threads = new Thread[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name " + (i+1) + ": ");
            String name = sc.nextLine();  

            System.out.print("Enter withdrawal amount for " + name + ": ");
            int amount = sc.nextInt();
            sc.nextLine(); 

            Transaction tx = new Transaction(account, name, amount);
            threads[i] = new Thread(tx, "Customer-" + (i+1));

            System.out.println(threads[i].getName() + " state: " + threads[i].getState());
        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All transactions processed!");
        sc.close();

	}
}

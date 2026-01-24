package com.bankingsystem;
import java.util.* ;

public class BankingSystem {

	private Map<Integer, Double> accounts = new HashMap<>() ;
	private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>( ) ;
	
	//method to add account, display account in sorted order and request withdrawal 
	public void addAccount(int accountNumber, double balance) {
		accounts.put(accountNumber, balance) ;
	}
	
	public void displayingAccountsSortedByBalance() {
		TreeMap<Double, Integer> sorted = new TreeMap<>() ;
		for(Map.Entry<Integer, Double> entry : accounts.entrySet()) {
			sorted.put(entry.getValue(), entry.getKey()) ;
		}
		
		System.out.println("Accounts Sorted By Balance") ;
		for(Map.Entry<Double, Integer> entry : sorted.entrySet()) {
			System.out.println("Account " +entry.getValue() +" -> Balance $" +entry.getKey()) ;
		}
	}
	
	public void requestWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    // method to process withdrawal requests in FIFO order
    public void processWithdrawals() {
        System.out.println("\n--- Processing Withdrawals ---");
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.poll();
            double currentBalance = accounts.getOrDefault(req.getAccountNumber(), 0.0);

            if (currentBalance >= req.getAmount()) {
                accounts.put(req.getAccountNumber(), currentBalance - req.getAmount());
                System.out.println("Withdrawal of ₹" + req.getAmount() + " from Account " + req.getAccountNumber() + " successful.");
            } else {
                System.out.println("Withdrawal of ₹" + req.getAmount() + " from Account " + req.getAccountNumber() + " failed (Insufficient Balance).");
            }
        }
    }
	
}

package com.optionalinterface.bankingapplication;
import java.util.* ;

public class OptionalBankDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input account details from user 
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter account holder name: ");
        String holder = sc.nextLine();
        
        System.out.print("Enter nominee name (or press Enter if missing): ");
        String nominee = sc.nextLine();
        
        if (nominee.isEmpty()) nominee = null;
        System.out.print("Enter loan details (or press Enter if missing): ");
        String loanDetails = sc.nextLine();
        
        if (loanDetails.isEmpty()) loanDetails = null;
        System.out.print("Enter account balance (or press Enter if missing): ");
        String balanceStr = sc.nextLine();
        
        Double balance = balanceStr.isEmpty() ? null : Double.parseDouble(balanceStr);
        System.out.print("Enter transaction reference number (or press Enter if missing): ");
        String transactionRef = sc.nextLine();
        
        if (transactionRef.isEmpty()) transactionRef = null;
        System.out.print("Enter credit card details (or press Enter if missing): ");
        String creditCard = sc.nextLine();
        
        if (creditCard.isEmpty()) creditCard = null;

        BankAccount acc = new BankAccount(id, holder, nominee, loanDetails, balance, transactionRef, creditCard);

        // Handle nominee safely
        System.out.println("\nNominee: " + acc.nominee.orElse("No nominee assigned"));

        // Fetch loan details safely
        System.out.println("Loan Details: " + acc.loanDetails.orElse("No loan details available"));

        // Return minimum balance if null
        System.out.println("Balance: " + acc.balance.orElse(1000.0));

        // Safely fetch transaction reference
        System.out.println("Transaction Reference: " + acc.transactionRef.orElse("No transaction reference"));

        // Display credit card details only if present
        acc.creditCard.ifPresent(card -> System.out.println("Credit Card Details: " + card));

        sc.close();
    }


}

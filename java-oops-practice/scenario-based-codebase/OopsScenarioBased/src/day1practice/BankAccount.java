package day1practice;

public class BankAccount {
	
	private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance)    {
        this.accountNumber = accountNumber;
		setBalance(initialBalance); 
    }

    // Public getter for accountNumber and balance
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Public setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Methods to deposit, withdraw money and display account information  and type
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
         System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
	public void displayAccountType() {
        System.out.println("Account Type: Generic Bank Account");
    }

}

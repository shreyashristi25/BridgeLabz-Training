package day1practice;

//creating CurrentAccount as subclass of BankAccount class
public class CurrentAccount extends BankAccount{

	private double overdraftLimit;

	 //constructor
	    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
	        super(accountNumber, balance);
	        this.overdraftLimit = overdraftLimit;
	    }
	    
	    //overriden methods of BankAccont class
	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            setBalance(getBalance() + amount);
	            System.out.println("Deposited: " + amount + " into Current Account");
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
	            setBalance(getBalance() - amount);
	            System.out.println("Withdrawn: " + amount + " (Overdraft allowed)");
	        } else {
	            System.out.println("Withdrawal denied. Exceeds overdraft limit.");
	        }
	    }

	    @Override
	    public void displayAccountType() {
	        System.out.println("Account Type: Current Account");
	        System.out.println("Overdraft Limit: " + overdraftLimit);
	    }
}

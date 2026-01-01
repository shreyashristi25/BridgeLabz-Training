package day1practice;

//creating SavingsAccount as subclass of BankAccount class
public class SavingsAccount extends BankAccount{

	private double interestRate;

    //constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    //overriden methods of BankAccount class 
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double interest = amount * (interestRate / 100);
            setBalance(getBalance() + amount + interest);
            System.out.println("Deposited: " + amount + " with interest: " + interest);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
	@Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied. Insufficient funds.");
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

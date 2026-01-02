package com.banking;
import java.util.* ;

//driver class for other classes in banking 
public class Banking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking customer input
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();

        // Taking account input
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        sc.nextLine(); 
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Type (savings/current): ");
        String type = sc.nextLine();

        // Create objects
        Customer customer = new Customer(name, id);
        Account account;

        if (type.equalsIgnoreCase("savings")) {
            account = new SavingsAccount(balance, accountNumber, 4.5); // example interest rate
        } else {
            account = new CurrentAccount(balance, accountNumber, 3000); // example overdraft limit
        }

        // Display info
        customer.displayInfo();
        account.displayInfo();
        System.out.println("Loan Eligible? " + account.checkLoanEligibility());

        sc.close();
    }

    

}

package com.mybank;
import java.util.* ;

//driver class for other classes for MyBank
public class MyBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;

		// Creating accounts with user input
        System.out.print("Enter Savings Account Number: ");
        String saNumber = sc.nextLine();
        System.out.print("Enter Opening Balance for Savings Account: ");
        double saBalance = sc.nextDouble();

        Account savings = new SavingsAccount(saNumber, saBalance);

        sc.nextLine(); 
        System.out.print("Enter Current Account Number: ");
        String caNumber = sc.nextLine();
        System.out.print("Enter Opening Balance for Current Account: ");
        double caBalance = sc.nextDouble();

        Account current = new CurrentAccount(caNumber, caBalance);

        //taking user input and displaying result 
        int choice ;
        do {
            System.out.println("===== MyBank =====");
            System.out.println("1. Deposit to Savings");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Current");
            System.out.println("4. Withdraw from Current");
            System.out.println("5. Check Balances");
            System.out.println("6. Calculate Interest");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit in Savings: ");
                    double daSA = sc.nextDouble();
                    savings.deposit(daSA);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw from Savings: ");
                    double waSA = sc.nextDouble();
                    savings.withdraw(waSA);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit in Current: ");
                    double daCA = sc.nextDouble();
                    current.deposit(daCA);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw from Current: ");
                    double waCA = sc.nextDouble();
                    current.withdraw(waCA);
                    break;
                case 5:
                    System.out.println("[Receipt] Savings Balance: " + savings.checkBalance());
                    System.out.println("[Receipt] Current Balance: " + current.checkBalance());
                    break;
                case 6:
                    System.out.println("[Receipt] Savings Interest: " + savings.calculateInterest());
                    System.out.println("[Receipt] Current Interest: " + current.calculateInterest());
                    break;
                case 0:
                    System.out.println("Thank you for banking with MyBank!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } 
        while (choice != 0);

        sc.close();


	}

}

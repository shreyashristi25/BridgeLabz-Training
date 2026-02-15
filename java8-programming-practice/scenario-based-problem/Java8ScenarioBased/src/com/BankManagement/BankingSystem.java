package com.BankManagement;
import java.util.* ;

public class BankingSystem {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input accounts
        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();
            accounts.add(new Account(name, balance));
        }

        //  Minimum balance rule
        BalanceRule rule = (bal) -> bal >= 1000 ? "Minimum Balance Maintained" : "Below Minimum Balance";
        System.out.println("\n--- Minimum Balance Check ---");
        accounts.forEach(a -> System.out.println(a.name + ": " + rule.check(a.balance)));

        // Simple Interest calculation
        Interest si = (p, r, t) -> (p * r * t) / 100;
        System.out.println("\n--- Simple Interest Calculation ---");
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        int time = sc.nextInt();
        System.out.println("Simple Interest: " + si.calculate(principal, rate, time));

        // Withdrawal validation
        Withdrawal withdrawal = (bal, amt) -> amt <= bal ? "Withdrawal Allowed" : "Insufficient Balance";
        System.out.println("\n--- Withdrawal Validation ---");
        System.out.print("Enter account index (0 to " + (accounts.size()-1) + "): ");
        int idx = sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        double amt = sc.nextDouble();
        System.out.println(withdrawal.validate(accounts.get(idx).balance, amt));

        //  Print account details
        System.out.println("\n--- Account Details ---");
        accounts.forEach(System.out::println);

        // Compare two account balances
 
        if (accounts.size() >= 2) {
            CompareBalance compare = (acc1, acc2) ->
                acc1.balance > acc2.balance ? acc1.name + " has higher balance" :
                acc1.balance < acc2.balance ? acc2.name + " has higher balance" :
                "Both have equal balance";

            System.out.println("\n--- Balance Comparison ---");
            System.out.println(compare.compare(accounts.get(0), accounts.get(1)));
        }


        sc.close();
    }

}

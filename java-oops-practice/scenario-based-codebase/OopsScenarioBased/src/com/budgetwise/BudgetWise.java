package com.budgetwise;
import java.util.* ;
public class BudgetWise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//getting user input  for income, limit, storing them into a map, getting number of categories and limit of categories
        System.out.print("Enter income: ");
        double income = sc.nextDouble();
        System.out.print("Enter budget limit: ");
        double limit = sc.nextDouble();

        Map<String, Double> categoryLimits = new HashMap<>();
        System.out.print("Enter number of categories: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter category name: ");
            String cat = sc.nextLine();
            System.out.print("Enter limit for " + cat + ": ");
            double catLimit = sc.nextDouble();
            sc.nextLine();
            categoryLimits.put(cat, catLimit);
        }

        Budget budget = new MonthlyBudget(income, limit, categoryLimits);

        //getting user choice as input, calling methods and displaying results accordingly
        while (true) {
            System.out.println("--- BudgetWise Menu ---");
            System.out.println("1. Add Transaction");
            System.out.println("2. Generate Report");
            System.out.println("3. Detect Overspend");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter type (Income/Expense): ");
                    String type = sc.nextLine();
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();
                    budget.addTransaction(new Transaction(amt, type, new Date(), cat));
                    System.out.println("Transaction added.");
                    break;

                case 2:
                    budget.generateReport();
                    break;
                
                case 3:
                    budget.detectOverspend();
                    break;

                case 4:
                    System.out.println("Exiting BudgetWise. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }


	}

}

package com.budgetwise;
import java.util.* ;

//creating monthly budget as subclass of Budget

public class MonthlyBudget extends Budget{

	//constructor
	public MonthlyBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("--- Monthly Budget Report ---");
        System.out.println("Income: " + income);
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Net Savings: " + getNetSavings());
    }

}

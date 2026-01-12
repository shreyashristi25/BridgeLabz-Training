package com.budgetwise;
import java.util.* ;

//creating class AnnualBudget as a subclass of Budget class
public class AnnualBudget extends Budget {

	//constructor
	public AnnualBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("=== Annual Budget Report ===");
        System.out.println("Yearly Income: " + income);
        System.out.println("Yearly Expenses: " + getTotalExpenses());
        System.out.println("Yearly Net Savings: " + getNetSavings());
    }

}

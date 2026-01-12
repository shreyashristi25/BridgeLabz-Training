package com.budgetwise;
import java.util.* ;

//creating a class budget that implements IAnalyzable interface
public abstract class Budget implements IAnalyzable{

	//private and protected variables to ensure limited access
	protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    private List<Transaction> transactions; 

    //constructor
    public Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    //methods to add transactions, get total expenses, get savings and get list of transactions 
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public double getTotalExpenses() {
        return transactions.stream()
                .filter(t -> t.getType().equalsIgnoreCase("Expense"))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public double getNetSavings() {
        return income - getTotalExpenses();
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions); 
    }


    //Overriden methods of IAnalyzable
    @Override
    public void detectOverspend() {
        double totalExpenses = getTotalExpenses();
        boolean overspend = false;

        if (totalExpenses > limit) {
            System.out.println(" Overspending detected! Total expenses exceed budget limit.");
            overspend = true;
        }

        for (String category : categoryLimits.keySet()) {
            double catExpense = transactions.stream()
                    .filter(t -> t.getType().equalsIgnoreCase("Expense") && t.getCategory().equalsIgnoreCase(category))
                    .mapToDouble(Transaction::getAmount)
                    .sum();
            if (catExpense > categoryLimits.get(category)) {
                System.out.println("Overspending in category: " + category);
                overspend = true;
            }
        }

        if (!overspend) {
            System.out.println("No overspending detected. You’re within your budget.");
        }
        
    }

    @Override
    public abstract void generateReport(); 
}

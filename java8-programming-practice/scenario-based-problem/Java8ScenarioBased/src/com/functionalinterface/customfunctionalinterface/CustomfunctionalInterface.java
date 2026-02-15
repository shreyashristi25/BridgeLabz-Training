package com.functionalinterface.customfunctionalinterface;
import java.util.* ;

public class CustomfunctionalInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Bonus calculation
        BonusCalculator bonusCalc = salary -> salary > 30000 ? salary * 0.10 : salary * 0.05;
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        System.out.println("Bonus: " + bonusCalc.calculate(salary));

        // Loan eligibility
        LoanEligibility loanCheck = (income, loanAmount) -> income >= (loanAmount / 2);
        System.out.print("\nEnter monthly income: ");
        double income = sc.nextDouble();
        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();
        System.out.println("Loan Eligibility: " + loanCheck.check(income, loanAmount));

        // Tax calculation
        TaxCalculator taxCalc = inc -> {
            if (inc <= 250000) return 0;
            else if (inc <= 500000) return inc * 0.05;
            else if (inc <= 1000000) return inc * 0.20;
            else return inc * 0.30;
        };
        System.out.print("\nEnter annual income: ");
        double annualIncome = sc.nextDouble();
        System.out.println("Tax: " + taxCalc.calculate(annualIncome));

        sc.nextLine();

        // Login validation
        LoginValidator login = (user, pass) -> user.equals("admin") && pass.equals("1234");
        System.out.print("\nEnter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.println("Login Successful: " + login.validate(username, password));

        sc.close();

	}

}

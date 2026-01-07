package com.loanbuddy;
import java.util. * ;
public class LoanBuddy {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking user input for applicant info
        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        // taking user input for loan info
        System.out.print("Enter Loan Type (personal/home/auto): ");
        String type = sc.next();

        System.out.print("Enter Term (months): ");
        int term = sc.nextInt();

        System.out.print("Enter Interest Rate (% per annum): ");
        double rate = sc.nextDouble();

        LoanApplication loan = null;
        
        switch (type.toLowerCase()) {
            case "personal":
                loan = new PersonalLoan(term, rate);
                break;
            case "home":
                loan = new HomeLoan(term, rate);
                break;
            case "auto":
                loan = new AutoLoan(term, rate);
                break;
            default:
                System.out.println("Invalid loan type!");
                System.exit(0);
        }

        // Processing loan and displaying result accordingly
        boolean approved = loan.approveLoan(applicant);
        double emi = loan.calculateEMI(applicant.getLoanAmount());

        // Output
        System.out.println("=== LoanBuddy Result ===");
        System.out.println("Applicant: " + applicant.getName());
        System.out.println("Loan Type: " + loan.getLoanType());
        System.out.println("Term (months): " + loan.getTermMonths());
        System.out.println("Interest Rate: " + loan.getInterestRate());
        System.out.println("Loan Amount: " + applicant.getLoanAmount());
        System.out.println("Monthly EMI: " + String.format("%.2f", emi));
        System.out.println("Status: " + (approved ? "APPROVED" : "REJECTED"));

        sc.close();
    }

}

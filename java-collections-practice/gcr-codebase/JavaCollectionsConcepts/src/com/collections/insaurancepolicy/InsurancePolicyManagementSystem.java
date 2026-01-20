package com.collections.insaurancepolicy;
import java.util. * ;
import java.time.* ;
public class InsurancePolicyManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        InsurancePolicyManager system = new InsurancePolicyManager();

        //taking user input for number of policies and their details
        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Policy Number: ");
            String policyNumber = sc.nextLine();

            System.out.println("Enter Policyholder Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Expiry Date (YYYY-MM-DD): ");
            LocalDate expiryDate = LocalDate.parse(sc.nextLine());

            System.out.println("Enter Coverage Type (Health/Auto/Home): ");
            String coverageType = sc.nextLine();

            System.out.println("Enter Premium Amount: ");
            double premium = sc.nextDouble();
            sc.nextLine();

            system.addPolicy(new Policy(policyNumber, name, expiryDate, coverageType, premium));
        }

        // Displaying results
        system.displayAllPolicies();
        system.displayExpiringSoon();
        system.displayByCoverage("Health");
        system.displayDuplicates();

        sc.close();


	}

}

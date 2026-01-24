package com.collections.policymanager;
import java.time.* ;
import java.util.* ;

public class InsurancePolicyManagementSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        PolicyManager manager = new PolicyManager();

        //taking user input for number of policies and their details
        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Policy " + (i+1));
            System.out.print("Policy Number: ");
            String number = sc.nextLine();

            System.out.print("Policyholder Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry Date (YYYY-MM-DD): ");
            LocalDate expiry = LocalDate.parse(sc.nextLine());

            System.out.print("Coverage Type (Health/Auto/Home): ");
            String coverage = sc.nextLine();

            System.out.print("Premium Amount: ");
            double premium = sc.nextDouble();
            sc.nextLine(); 

            manager.addPolicy(new Policy(number, name, expiry, coverage, premium));
        }
       
        //displaying result
        manager.showAll();
        System.out.println();
        manager.showExpiringSoon();

        System.out.print("Enter coverage type to filter: ");
        String type = sc.nextLine();
        manager.showByCoverage(type);

        sc.close();


	}

}

package com.exceptionhandling;
import java.util.*;

public class InterestCalculator {

	//method to calculate interest and throwing the exception using throw
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
           
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            // Taking user input for principal, rate and years and calculating interest
            System.out.print("Enter principal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter number of years: ");
            int years = sc.nextInt();

            double interest = calculateInterest(amount, rate, years);

            System.out.println("Calculated Interest: " + interest);

        } 
        catch (IllegalArgumentException e) {
           
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            
            System.out.println("Invalid input: Amount and rate must be positive");
        } 
        sc.close();
        
	}

}

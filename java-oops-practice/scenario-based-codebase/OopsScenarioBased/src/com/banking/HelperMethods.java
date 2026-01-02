package com.banking;

//creating a helper class with helper methods
public class HelperMethods {

	// method to Validate user input
    public static boolean validateUserInput(Customer customer, Account account) {
        return customer.getName() != null && !customer.getName().isEmpty()
                && customer.getId() > 0
                && account.getBalance() >= 0
                && account.getAccountNumber() != null && !account.getAccountNumber().isEmpty();
    }

    // method to Calculate discount
    public static double calculateDiscount(double amount, double discountRate) {
        return amount - (amount * discountRate / 100);
    }

}

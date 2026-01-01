package com.encapsulation;

//creating class ECommercePlatform  to store items and calculate discount, tax and final price
public class ECommercePlatform {

	public static void printFinalPrices(java.util.List<Product> products) {
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            //displaying details
            System.out.println("Product: " + p.getName());
            System.out.println("Base Price: " + p.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------------");
        }
    }
}

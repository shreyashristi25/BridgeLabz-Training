package com.functionalinterface.supplier;
import java.util.* ;
import java.util.function.*;

public class SupplierDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate OTP using Supplier
        Supplier<String> otpSupplier = () -> {
            Random rand = new Random();
            int otp = 100000 + rand.nextInt(900000); 
            return String.valueOf(otp);
        };
        System.out.println("\nGenerated OTP: " + otpSupplier.get());

        // Generate random student ID using Supplier
        Supplier<String> studentIdSupplier = () -> {
            Random rand = new Random();
            return "STU" + (1000 + rand.nextInt(9000));
        };
        System.out.println("Generated Student ID: " + studentIdSupplier.get());

        // Provide current date and time using Supplier
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println("Current Date & Time: " + dateSupplier.get());

        // Provide default welcome message using Supplier
        Supplier<String> welcomeSupplier = () -> "Welcome to the System!";
        System.out.println("Default Welcome Message: " + welcomeSupplier.get());

        //Generate random discount coupon using Supplier
        Supplier<String> couponSupplier = () -> {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder coupon = new StringBuilder("DISC-");
            Random rand = new Random();
            for (int i = 0; i < 6; i++) {
                coupon.append(chars.charAt(rand.nextInt(chars.length())));
            }
            return coupon.toString();
        };
        System.out.println("Generated Discount Coupon: " + couponSupplier.get());

        sc.close();
    }


}

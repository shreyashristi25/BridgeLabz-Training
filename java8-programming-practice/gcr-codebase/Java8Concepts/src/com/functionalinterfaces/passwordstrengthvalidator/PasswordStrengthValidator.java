package com.functionalinterfaces.passwordstrengthvalidator;
import java.util.* ;

public class PasswordStrengthValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("=== Insurance Portal Password Validator ===");

        //taking password as user input and using SecurityUtils interface to check password strength
        while (true) {
            System.out.print("\nEnter a password to validate (or type 'exit' to quit): ");
            String password = sc.nextLine();

            if (password.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Password Validator...");
                break;
            }

            boolean strong = SecurityUtils.checkPasswordStrength(password);

            if (strong) {
                System.out.println("Password is STRONG and VALID as per policy.");
            } 
            else {
                System.out.println(" Password is WEAK and does not meet policy rules.");
            }
        }

        sc.close();


	}

}

package com.junit.main.passwordvalidator;
import java.util.* ;

public class PasswordValidatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        PasswordValidator validator = new PasswordValidator();

        //getting password as user input, validating and displaying result accordingly
        System.out.print("Enter a password to validate: ");
        String password = sc.nextLine();

        if (validator.isValid(password)) {
            System.out.println("Password is strong!");
        } 
        else {
            System.out.println("Password is weak. Must be at least 8 characters, contain one uppercase letter, and one digit.");
        }

        sc.close();


	}

}

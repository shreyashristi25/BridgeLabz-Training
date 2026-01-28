package com.junit.main.userregistration;
import java.util.* ;

public class UserRegistrationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        UserRegistration registration = new UserRegistration();

        //taking user input for username, email, password
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (registration.registerUser(username, email, password)) {
                System.out.println("User registered successfully!");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

        sc.close();

	}

}

package com.annotation.maxlength;
import java.util.* ;

public class MaxLengthMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking user input and displaying result accordingly
        System.out.print("Enter username (max 10 chars): ");
        String inputUsername = sc.nextLine();

        try {
            User user = new User(inputUsername);
            System.out.println("User created successfully! Username: " + user.getUsername());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();


	}

}

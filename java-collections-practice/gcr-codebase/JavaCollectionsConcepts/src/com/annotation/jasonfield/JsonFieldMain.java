package com.annotation.jasonfield;
import java.util.* ;

public class JsonFieldMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking user input and displaying result accordingly
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        User user = new User(username, email, age);

        String jsonOutput = JsonSerializer.toJson(user);
        System.out.println("Serialized JSON: " + jsonOutput);

        sc.close();


	}

}

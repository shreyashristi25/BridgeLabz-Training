package com.functionalinterfaces.sensistivedatatagging;
import java.util.* ;

public class SensitiveDataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking user input and displaying result accordingly
        System.out.println("Choose object type:");
        System.out.println("1. UserCredentials (sensitive)");
        System.out.println("2. Product (non-sensitive)");
        System.out.println("Enter your choice  : ") ;
        
        int choice = sc.nextInt();
        sc.nextLine();

        Object obj;

        if (choice == 1) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            
            obj = new UserCredentials(username, password);
        } 
        else if (choice == 2) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            
            obj = new Product(name, price);
        } 
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        EncryptionProcessor.process(obj);

        sc.close();


	}

}

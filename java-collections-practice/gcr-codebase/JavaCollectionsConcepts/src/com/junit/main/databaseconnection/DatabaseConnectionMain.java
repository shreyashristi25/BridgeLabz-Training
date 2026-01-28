package com.junit.main.databaseconnection;
import java.util.* ;

public class DatabaseConnectionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		DatabaseConnection db = new DatabaseConnection();

		//taking user choice as input and displaying result accordingly
		int choice;
        do {
            
            System.out.println("1. Connect to Database");
            System.out.println("2. Disconnect from Database");
            System.out.println("3. Check Connection Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    db.connect();
                    System.out.println("Connection established.");
                    break;

                case 2:
                    db.disconnect();
                    System.out.println("Connection closed.");
                    break;

                case 3:
                    if (db.isConnected()) {
                        System.out.println("Database is currently connected.");
                    } 
                    else {
                        System.out.println("Database is currently disconnected.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}


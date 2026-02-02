package com.functionalinterfaces.dataserialization;
import java.util.* ;

public class BackupMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking user choice as input and displaying result accordingly
        System.out.println("Choose object to backup:");
        System.out.println("1. Employee");
        System.out.println("2. Department");
        System.out.println("enter your choice : ") ;
        int choice = sc.nextInt();
        sc.nextLine(); 

        Object obj;

        if (choice == 1) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            
            obj = new Employee(id, name);
        }
        else if (choice == 2) {
            System.out.print("Enter Department Name: ");
            String dept = sc.nextLine();
            
            obj = new Department(dept);
        }
        else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        BackupProcessor.processBackup(obj);

        sc.close();


	}

}

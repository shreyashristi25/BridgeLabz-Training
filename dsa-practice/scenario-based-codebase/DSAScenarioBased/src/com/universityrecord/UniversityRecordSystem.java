package com.universityrecord;
import java.util. * ;

public class UniversityRecordSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		StudentBST bst = new StudentBST() ;
		
		//taking user choice as input and displaying result accordingly
		while (true) {
            System.out.println("--- University Digital Record System ---");
            System.out.println("1. Insert Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students (In Sorted Order)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.print("Enter Roll No: ");
                int rollNo = sc.nextInt();
                sc.nextLine(); 

                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                
                System.out.print("Enter Course: ");
                String course = sc.nextLine();
                
                bst.root = bst.insert(bst.root, rollNo, name, course);
                System.out.println("Student " + name +" added in the system.") ;
                break;

            case 2:
                System.out.print("Enter Roll No to Delete: ");
                int delRoll = sc.nextInt();
                
                bst.root = bst.delete(bst.root, delRoll);
                System.out.println("Record deleted if it existed.") ;
                break;

            case 3:
                System.out.print("Enter Roll No to Search: ");
                int searchRoll = sc.nextInt();
                
                Student found = bst.search(bst.root, searchRoll);
                if (found != null)
                    System.out.println("Found: " + found.rollNumber + " - " + found.name + " (" + found.course + ")");
                else
                    System.out.println("Record not found!");
                break;

            case 4:
            	if (bst.root == null) {
                    System.out.println("The student record system is empty!");
                }
                System.out.println("Sorted Student Records:");
                bst.inorder(bst.root);
                break;
              
            case 5:
                System.out.println("Exiting..............!");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice! Try again.");
            }
            
		}
		
	}

}

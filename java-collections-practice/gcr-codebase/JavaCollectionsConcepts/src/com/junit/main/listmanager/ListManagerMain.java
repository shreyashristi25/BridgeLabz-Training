package com.junit.main.listmanager;
import java.util.* ;

public class ListManagerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		ListManager manager = new ListManager() ;
		List<Integer> list = new ArrayList<>();

		//taking user choice as input, calling methods and displaying result accordingly
        int choice;
        do {
            System.out.println("--- List Manager Menu ---");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Get Size");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int addElement = sc.nextInt();
                    manager.addElement(list, addElement);
                    System.out.println(addElement + " added successfully!");
                    break;

                case 2:
                    System.out.print("Enter element to remove: ");
                    int removeElement = sc.nextInt();
                    manager.removeElement(list, removeElement);
                    System.out.println(removeElement + " removed (if present).");
                    break;

                case 3:
                    System.out.println("Current size of list: " + manager.getSize(list));
                    break;

                case 4:
                    System.out.println("List contents: " + list);
                    break;

                case 5:
                    System.out.println("Exiting..............!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();


	}

}

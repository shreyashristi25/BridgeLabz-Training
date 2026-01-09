package com.foodloop;
import java.util.* ;
public class FoodLoop {

	public static void main(String agrs []) {
		Scanner sc = new Scanner(System.in);

		//taking user choice to order or add items
		System.out.println("Need to add items before you order ! ") ;
        System.out.print("Enter number of food items to add to menu: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        FoodItem [] menu = new FoodItem[n];
        Order order = new Order(20);

        int choice;
        do {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add Items");
            System.out.println("2. Order Items");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch(choice) {
            case 1:
            	//Taking user input to add item
                for (int i = 0; i < n; i++) {
                    System.out.println("Enter details for item " + (i+1));
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Category (veg/nonveg): ");
                    String category = sc.nextLine().toLowerCase();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine(); 

                    if (category.equals("veg")) {
                        menu[i] = new VegItem(name, price, stock);
                    } 
                    else {
                        menu[i] = new NonVegItem(name, price, stock);
                    }
                }
                break;

            case 2:
                int subChoice;
                //taking user input for ordering item 
                do {
                    System.out.println("--- FoodLoop Menu ---");
                    for (int i = 0; i < menu.length; i++) {
                        System.out.println((i+1) + ". " + menu[i].getName() +" (" + menu[i].getCategory() + ") ₹" + menu[i].getPrice());
                    }
                    System.out.println((menu.length+1) + ". Place Order");
                    System.out.println((menu.length+2) + ". Cancel Order");
                    System.out.println((menu.length+3) + ". Back to Main Menu");
                    System.out.print("Enter choice: ");
                    subChoice = sc.nextInt();

                    if (subChoice >= 1 && subChoice <= menu.length) {
                        order.addItem(menu[subChoice-1]);
                        System.out.println(menu[subChoice-1].getName() + " added to order.");
                    }
                    else if (subChoice == menu.length+1) {
                        order.placeOrder();
                    }
                    else if (subChoice == menu.length+2) {
                        order.cancelOrder();
                    }
                    else if (subChoice == menu.length+3) {
                        System.out.println("Returning to Main Menu...");
                    }
                    else {
                        System.out.println("Invalid choice!");
                    }
                } 
                while(subChoice != menu.length+3);
                break;

            case 3:
                System.out.println("Thank you for using FoodLoop!");
                break;

            default:
                System.out.println("Invalid choice!");
            }
        }
        while(choice != 3);

        sc.close();

	}
}

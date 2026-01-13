package com.supermarketbilling;
import java.util.* ;
public class SmartCheckout {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Map<String, Item> inventory = new HashMap<>();

        //taking user input for number of items in inventory
        System.out.print("Enter number of items to add to inventory: ");
        int n = sc.nextInt();
        sc.nextLine();

        //taking item's details as user input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for item " + (i+1) + ":");
            System.out.print("Item name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Stock: ");
            int stock = sc.nextInt();
            sc.nextLine(); 

            inventory.put(name, new Item(name, price, stock));
        }

        // Displaying inventory
        System.out.println("--- Inventory ---");
        for (Item item : inventory.values()) {
            System.out.println(item.name + " - Price: $" + item.price + ", Stock: " + item.stock);
        }
        
        CheckoutCounter counter = new CheckoutCounter(inventory);


        //taking user choice, processing and displaying results accordingly
        while (true) {
            System.out.println("--- SmartCheckout Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Process Customer");
            System.out.println("3. Show Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter items (comma separated): ");
                    String itemsLine = sc.nextLine();
                    
                    List<String> items = Arrays.asList(itemsLine.split(","));
                    counter.addCustomer(new Customer(name, items));
                    break;

                case 2:
                    counter.processQueue();
                    break;

                case 3:
                    counter.showInventory();
                    break;

                case 4:
                    System.out.println("Exiting SmartCheckout...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

	}

}

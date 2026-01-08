package com.medistore;
import java.util.* ;
import java.time.* ;

//driver class for all other classes in MediStore application
public class MediStore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//creating objects of subclasses
        Medicine m1 = new Tablet("Paracetamol", 20.0, LocalDate.of(2026, 12, 31), 20);
        Medicine m2 = new Syrup("Cough Syrup", 50.0, LocalDate.of(2026, 1, 20), 30);
        Medicine m3 = new Injection("Insulin", 200.0, LocalDate.of(2026, 1, 10), 40);

        //array to maintain inventory of medicines
        Medicine [] inventory = {m1, m2, m3};

        //Taking user's choice as input, accessing methods and displaying result accordingly
        int choice;
        do {
            System.out.println("=== MediStore Menu ===");
            System.out.println("1. View Inventory");
            System.out.println("2. Sell Medicine");
            System.out.println("3. Apply Discount");
            System.out.println("4. Adjust Stock");
            System.out.println("5. Check Expiry");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("--- Inventory ---");
                for (Medicine med : inventory) {
                    System.out.println(med.getName() + " | Price: " + med.totalPrice(1) +" | Qty: " + med.getQuantity() +" | Expiry: " + med.getExpiryDate());
                }
                break;

            case 2:
                System.out.print("Enter medicine index (0-2): ");
                int idxSell = sc.nextInt();
                
                System.out.print("Enter units to sell: ");
                int units = sc.nextInt();
                
                inventory[idxSell].sell(units);
                break;

            case 3:
                System.out.print("Enter medicine index (0-2): ");
                int idxDisc = sc.nextInt();
                
                System.out.print("Enter discount %: ");
                double disc = sc.nextDouble();
                
                inventory[idxDisc].applyDiscount(disc);
                System.out.println("Discount applied!");
                break;


            case 4:
                System.out.print("Enter medicine index (0-2): ");
                int idxStock = sc.nextInt();
                
                System.out.print("Enter stock adjustment (+/-): ");
                int change = sc.nextInt();
                
                inventory[idxStock].adjustStock(change);
                System.out.println("Stock updated!");
                break;

            case 5:
                System.out.print("Enter medicine index (0-2): ");
                int idxExp = sc.nextInt();
                
                boolean expired = inventory[idxExp].checkExpiry();
                System.out.println("Expiry check: " + (expired ? "Expired/Close to expiry" : "Safe to use"));
                break;

            case 0:
                System.out.println("Exiting MediStore...");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    } 
    while (choice != 0);

    sc.close();

	}

}

package com.swiftcart;
import java.util.* ;

//driver class for other classes in SwiftCart application
public class SwiftCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        //getting user input, creating objects, accessing methods and displaying result
        int choice;
        do {
            System.out.println("===== SwiftCart Menu =====");
            System.out.println("1. Add Product");
            System.out.println("2. Apply Discount");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.next();
                    
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    
                    System.out.print("Enter category (Perishable/NonPerishable): ");
                    String category = sc.next();

                    Product product;
                    if (category.equalsIgnoreCase("Perishable")) {
                        product = new PerishableProduct(name, price, category);
                    } 
                    else {
                        product = new NonPerishableProduct(name, price, category);
                    }

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    
                    cart.addProduct(product, qty);
                    System.out.println(qty + " " + name + "(s) added to cart.");
                    break;

                case 2:
                    System.out.print("Enter coupon value: ");
                    double coupon = sc.nextDouble();
                    cart.applyDiscount(coupon);
                    System.out.println("Discount applied successfully!");
                    break;

                case 3:
                    cart.generateBill();
                    break;

                case 4:
                    System.out.println("Thank you for shopping with SwiftCart!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();

	}

}

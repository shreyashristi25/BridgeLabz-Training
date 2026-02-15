package com.shoppingcart;
import java.util.* ;

public class ShoppingCart {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking number of products and their details as user input 
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            products.add(new Product(name, price));
        }

        //Apply 10% discount
        Discount discount = (price) -> price * 0.90;
        System.out.println("\n--- Discounted Prices ---");
        products.forEach(p -> System.out.println(p.name + " Discounted Price: " + discount.apply(p.price)));

        // Sort by price
        System.out.println("\n--- Products Sorted by Price ---");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        //Free delivery eligibility
        Delivery delivery = (amt) -> amt > 500 ? "Free Delivery Eligible" : "Delivery Charges Apply";
        System.out.println("\n--- Delivery Eligibility ---");
        products.forEach(p -> System.out.println(p.name + ": " + delivery.check(p.price)));


        //  Final bill calculation
        Bill bill = (list) -> list.stream().mapToDouble(p -> p.price).sum();
        double total = bill.calculate(products);
        System.out.println("\nFinal Bill Amount: " + total);

        //Print product names
        System.out.println("\n--- Product Names ---");
        products.forEach(p -> System.out.println(p.name));

        sc.close();

	}
}

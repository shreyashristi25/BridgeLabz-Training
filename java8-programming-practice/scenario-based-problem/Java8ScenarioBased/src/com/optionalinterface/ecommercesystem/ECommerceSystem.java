package com.optionalinterface.ecommercesystem;
import java.util.* ;

public class ECommerceSystem {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        // Input product details from user 
	        System.out.print("Enter product name: ");
	        String name = sc.nextLine();
	        
	        System.out.print("Enter discount (or press Enter if missing): ");
	        String discountStr = sc.nextLine();
	        
	        Double discount = discountStr.isEmpty() ? null : Double.parseDouble(discountStr);
	        System.out.print("Enter coupon code (or press Enter if missing): ");
	        String coupon = sc.nextLine();
	        
	        if (coupon.isEmpty()) coupon = null;
	        System.out.print("Enter seller details (or press Enter if missing): ");
	        String seller = sc.nextLine();
	        
	        if (seller.isEmpty()) seller = null;
	        System.out.print("Enter product description (or press Enter if missing): ");
	        String description = sc.nextLine();
	        
	        if (description.isEmpty()) description = null;
	        System.out.print("Enter delivery partner info (or press Enter if missing): ");
	        String deliveryPartner = sc.nextLine();
	        
	        if (deliveryPartner.isEmpty()) deliveryPartner = null;

	        Product product = new Product(name, discount, coupon, seller, description, deliveryPartner);

	        //Apply default discount if missing
	        System.out.println("\nDiscount: " + product.discount.orElse(5.0) + "%");

	        //Fetch coupon code if present, otherwise skip
	        product.coupon.ifPresentOrElse(
	            c -> System.out.println("Coupon Code Applied: " + c),
	            () -> System.out.println("No coupon applied")
	        );

	        //Display seller details safely
	        System.out.println("Seller: " + product.seller.orElse("Seller details not available"));

	        //Handle missing description
	        System.out.println("Description: " + product.description.orElse("No description available"));

	        //Fetch delivery partner info safely
	        System.out.println("Delivery Partner: " + product.deliveryPartner.orElse("No delivery partner assigned"));

	        sc.close();


	}

}

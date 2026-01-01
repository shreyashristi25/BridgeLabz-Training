package com.encapsulation;

//driver class for all the classes of Online Food Delivery system
public class OnlineFoodDelivery {

	public static void main(String[] args) {

		 // Array of food items , accessing methods and displaying result
        FoodItem[] order = new FoodItem[2];
        order[0] = new VegItem("Paneer Butter Masala", 200, 2);
        order[1] = new NonVegItem("Chicken Biryani", 300, 3);

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());

            
            Discountable disc = (Discountable) item;
            disc.applyDiscount(10); 

            System.out.println(disc.getDiscountDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("-----------------------------------");
        }

	}

}

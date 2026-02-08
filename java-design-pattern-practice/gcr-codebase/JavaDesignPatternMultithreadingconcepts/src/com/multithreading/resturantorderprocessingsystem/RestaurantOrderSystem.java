package com.multithreading.resturantorderprocessingsystem;
import java.util.* ;

public class RestaurantOrderSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking number of chefs as user input 
        System.out.print("Enter number of chefs/dishes: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Chef[] chefs = new Chef[n];

        // Collecting dish details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter dish name for Chef-" + (i+1) + ": ");
            String dish = sc.nextLine();

            System.out.print("Enter preparation time (in seconds) for " + dish + ": ");
            double seconds = sc.nextDouble();
            sc.nextLine();
            
            int cookTime = (int)(seconds * 1000); // convert to milliseconds
            chefs[i] = new Chef("Chef-" + (i+1), dish, cookTime);

            System.out.println(chefs[i].getName() + " state before start: " + chefs[i].getState());
        }

        // Starting all chefs, manger waits for all chefs
        for (Chef chef : chefs) {
            chef.start();
        }

        for (Chef chef : chefs) {
            try {
                chef.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Kitchen closed - All orders completed!");
        sc.close();


	}

}

package com.ticketpriceoptimizer;
import java.util.* ;

public class EventManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of tickets and their prices
		System.out.println("Enter the number of tickets : ") ;
		int n = sc.nextInt();
		int [] prices = new int[n] ;
		
		System.out.println("Enter ticket prices : ") ;
		for(int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		
		//calling quickSort method 
		QuickSort.quickSort(prices,  0,  n-1);
		System.out.println("Top Cheapest Tickets:");
        for (int i = 0; i < Math.min(50, n); i++) {
            System.out.println(prices[i] + " ");
        }

        // displaying top 50 most expensive
        System.out.println("\nTop Most Expensive Tickets:");
        for (int i = n - 1; i >= Math.max(n - 50, 0); i--) {
            System.out.println(prices[i] + " ");
        }

        sc.close();

	}

}

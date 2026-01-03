package com.stackandqueue.stockspanproblem;
import java.util.* ;

//driver class for StockSpan 
public class StockSpanMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking user input and displaying result
		StockSpan s = new StockSpan() ;
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int [] prices = new int[n];

        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int [] span = s.calculateSpan(prices);

        System.out.println("Day\tPrice\tSpan");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + prices[i] + "\t" + span[i]);
        }

        sc.close();


	}

}

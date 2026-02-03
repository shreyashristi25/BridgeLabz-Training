package com.streamapi.stockpricelogger;
import java.util.* ;

public class StockPriceLogger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of stock prices and their prices from user 
		List<Double> stockPrices = new ArrayList<>() ;
		System.out.println("Enter number of stock prices : ") ;
		int n = sc.nextInt() ;
		
		for( int i =0; i < n; i++) {
			System.out.println("Enter stock prices : ") ;
			double price = sc.nextDouble() ;
			
			stockPrices.add(price) ;
		}
		
		//displaying stock prices using forEach 
		System.out.println("Stock Prices : ") ;
		stockPrices.forEach(price -> System.out.println("Stock Prices : " +price)) ;

	}

}

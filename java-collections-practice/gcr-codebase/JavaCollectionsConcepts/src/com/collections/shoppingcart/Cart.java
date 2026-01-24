package com.collections.shoppingcart;

import java.util.*;

public class Cart {


	private Map<String, Double> prices =  new HashMap<> () ;
	private Map<String , Double> orderedProducts = new LinkedHashMap<> () ;
	
	//method to add items with their prices in cart
	public void addItem(String item, double price) {
		prices.put(item, price);
        orderedProducts.put(item, price);

	}
	
	//method to display item prices sorted by item price
	public void displaySortedResult() {
        
        TreeMap<Double, String> sortedPrice = new TreeMap<>();

        for (Map.Entry<String, Double> entry : prices.entrySet()) {
            sortedPrice.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Results Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedPrice.entrySet()) {
            System.out.println(entry.getValue() + " -> $" + entry.getKey());
        }
    }

	//method to display the original list of items and their prices
	public void displayOriginalResult() {
		System.out.println("Results in Original Order : ") ;
		for(Map.Entry<String, Double> entry  : orderedProducts.entrySet()) {
			System.out.println(entry.getKey() +" -> " +entry.getValue()) ;
		}
	}
	
}

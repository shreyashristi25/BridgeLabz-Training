package com.supermarketbilling;
import java.util.* ;
public class CheckoutCounter {

	Queue<Customer> queue = new LinkedList<>();
    Map<String, Item> inventory;

    CheckoutCounter(Map<String, Item> inventory) {
        this.inventory = inventory;
    }

    //method to add customer in queue, process queue and show inventory
    public void addCustomer(Customer c) {
    	queue.add(c) ;
    	System.out.println("Customer " +c.name +" joined the queue!") ;
    }
    
    public void processQueue() {
    	Customer c = queue.poll();
    	if(c== null) {
    		System.out.println("No Customer in queue.") ;
    		return ;
    	}
    	double total = 0;
        System.out.println("Processing " + c.name + "'s purchase:");
        for (String itemName : c.items) {
            Item item = inventory.get(itemName);
            if (item != null && item.stock > 0) {
                total += item.price;
                item.stock--;
                System.out.println("- " + itemName + " @ " + item.price + " (Remaining stock: " + item.stock + ")");
            } 
            else {
                System.out.println("- " + itemName + " is out of stock!");
            }
        }
        System.out.println("Total Bill for " + c.name + ": $" + total);
    }
    
    public void showInventory() {
    	System.out.println("Current inventory : ") ;
    	for(Item item : inventory.values()) {
    		System.out.println("Item " +item.name +" | Price " +item.price +" | Stock " +item.stock) ;
    	}
    	
    }
    

    
}

package com.banking;

public class Customer {
	
	private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
    	return name; 
    }
    public int getId() { 
    	return id; 
    }

  //method to display customer info
    public void displayInfo() {
    	 System.out.println("Customer: " + name + " | ID: " + id);

    }


}

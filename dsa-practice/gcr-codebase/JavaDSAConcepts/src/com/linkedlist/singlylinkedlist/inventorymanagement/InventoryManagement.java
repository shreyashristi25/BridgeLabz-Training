package com.linkedlist.singlylinkedlist.inventorymanagement;

//driver class for other classes of inventory management system
public class InventoryManagement {

	public static void main(String[] args) {


		//creating object, accessing methods and displaying result
		InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtBeginning(101, "Laptop", 10, 50000);
        inventory.addAtEnd(102, "Mouse", 50, 500);
        inventory.addAtPosition(2, 103, "Keyboard", 30, 1500);

        inventory.displayRecords();

        inventory.searchById(102);
        inventory.searchByName("Laptop");

        inventory.updateQuantity(103, 40);
        inventory.displayRecords();

        inventory.calculateTotalValue();

        inventory.sortByName(true);
        inventory.displayRecords();

        inventory.sortByPrice(false);
        inventory.displayRecords();

        inventory.removeById(101);
        inventory.displayRecords();


	}

}

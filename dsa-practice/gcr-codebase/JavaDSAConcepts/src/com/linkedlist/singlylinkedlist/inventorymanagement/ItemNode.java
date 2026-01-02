package com.linkedlist.singlylinkedlist.inventorymanagement;

public class ItemNode {

	//creating variables to store itmeid, item name, quantity, price, next
	int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    //constructor
    public ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

}

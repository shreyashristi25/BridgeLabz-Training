package com.linkedlist.singlylinkedlist.inventorymanagement;

public class InventoryLinkedList {

	private ItemNode head;

    // method to add an item at beginning
    public void addAtBeginning(int itemId, String itemName, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemId, itemName, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // method to add an item at end
    public void addAtEnd(int itemId, String itemName, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemId, itemName, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // method to add an item at specific position 
    public void addAtPosition(int position, int itemId, String itemName, int quantity, double price) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        ItemNode newNode = new ItemNode(itemId, itemName, quantity, price);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        ItemNode temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    // method to remove item by ID
    public void removeById(int itemId) {
        if (head == null) {
        	System.out.println();
            System.out.println("Inventory is empty!");
            System.out.println();
            return;
        }
        if (head.itemId == itemId) {
            head = head.next;
            System.out.println();
            System.out.println("Item with ID " + itemId + " removed.");
            System.out.println();
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
        	System.out.println();
            System.out.println("Item not found!");
            System.out.println();
        } else {
            temp.next = temp.next.next;
            System.out.println();
            System.out.println("Item with ID " + itemId + " removed.");
            System.out.println();
        }
    }
    
    // method to update quantity by ID
    public void updateQuantity(int itemId, int newQuantity) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println();
                System.out.println("Quantity updated for Item ID " + itemId);
                return;
            }
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Item not found!");
    }

    // method to search by ID
    public void searchById(int itemId) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
            	System.out.println();
                System.out.println("Item Found: ID=" + temp.itemId + ", Name=" + temp.itemName +
                        ", Qty=" + temp.quantity + ", Price=" + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Item not found!");
    }

    // method to search by Name
    public void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
            	System.out.println();
                System.out.println("Item Found: ID=" + temp.itemId + ", Name=" + temp.itemName +
                        ", Qty=" + temp.quantity + ", Price=" + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Item not found!");
    }

    // method to calculate total inventory value
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Total Inventory Value = " + total);
    }

    // method to sort by Item Name 
    public void sortByName(boolean ascending) {
        if (head == null) return;

        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                boolean condition = ascending ?
                        i.itemName.compareToIgnoreCase(j.itemName) > 0 :
                        i.itemName.compareToIgnoreCase(j.itemName) < 0;
                if (condition) {
                    swapData(i, j);
                }
            }
        }
        System.out.println();
        System.out.println("Inventory sorted by Name " + (ascending ? "ascending" : "descending"));
    }



    // method to sort by Price 
    public void sortByPrice(boolean ascending) {
        if (head == null) return;

        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                boolean condition = ascending ? i.price > j.price : i.price < j.price;
                if (condition) {
                    swapData(i, j);
                }
            }
        }
        System.out.println();
        System.out.println("Inventory sorted by Price " + (ascending ? "ascending" : "descending"));
    }


    //helper method for swapping
    private void swapData(ItemNode a, ItemNode b) {
        int tempId = a.itemId;
        String tempName = a.itemName;
        int tempQty = a.quantity;
        double tempPrice = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = tempId;
        b.itemName = tempName;
        b.quantity = tempQty;
        b.price = tempPrice;
    }


    // Display all records
    public void displayRecords() {
        if (head == null) {
        	System.out.println();
            System.out.println("No items in inventory!");
            return;
        }
        ItemNode temp = head;
        System.out.println();
        System.out.println("Inventory Records:");
        while (temp != null) {
        	System.out.println();
            System.out.println("ID=" + temp.itemId + ", Name=" + temp.itemName +
                    ", Qty=" + temp.quantity + ", Price=" + temp.price);
            temp = temp.next;
        }
    }


}

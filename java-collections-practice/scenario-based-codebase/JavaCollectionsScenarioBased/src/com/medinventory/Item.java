package com.medinventory;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Item {

	 private String itemId;
	 private String itemName;	
	 private int quantity;
	 private String expiryDate;

	 //constructor
	 public Item(String itemId, String itemName, int quantity, String expiryDate) {
		 this.itemId = itemId;
		 this.itemName = itemName;
		 this.quantity = quantity;
		 this.expiryDate = expiryDate;
	 }

	 //getter methods to get item id, name, quantity and expiry date
	 public String getItemId() { return itemId; }
	 public String getItemName() { return itemName; }
	 public int getQuantity() { return quantity; }
	 public String getExpiryDate() { return expiryDate; }

	 @Override
	 public boolean equals(Object o) {
		 if (this == o) return true;
		 if (!(o instanceof Item)) return false;
		 Item item = (Item) o;
		 return itemId.equals(item.itemId); // uniqueness by ID
	 }

	 @Override
	 public int hashCode() {
		 return Objects.hash(itemId);
	 }

	 @Override
	 public String toString() {
		 return itemId + " - " + itemName + " (" + quantity + ") Exp: " + expiryDate;
	 }

}

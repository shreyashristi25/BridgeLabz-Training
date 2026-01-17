package com.generics.smartwarehousemanagement;
import java.util.* ;

//creating Storage class using generics
public class Storage <T extends Warehouse>{
	private List<T> items = new ArrayList<> () ;

	public void addItem(T item) {
		items.add(item) ;
	} 
	public List<T> getItems() {
		return items ;
	}
	

}

package com.historymanager;

public class Tab {

	private History current ;
	
	//constructor
	public Tab(String startUrl) {
		current = new History(startUrl) ;
	}
	
	//method to visit a tab
	public void visit(String url) {
	    History newNode = new History(url);
	    current.next = null;

	    newNode.prev = current;
	    current.next = newNode;
	    current = newNode;
	}

	
	//method to go back and forward in tabs
	public void back() {
	    if (current.prev != null) {
	        current = current.prev;
	        System.out.println("⬅ Back to: " + current.url);
	    } else {
	        System.out.println("⚠ Already at the first page in history!");
	    }
	}

	public void forward() {
	    if (current.next != null) {
	        current = current.next;
	        System.out.println("➡ Forward to: " + current.url);
	    } else {
	        System.out.println("⚠ Already at the latest page in history!");
	    }
	}

	//method to show tab history
	public void showHistory() {
	    History node = current;
	    while (node.prev != null) node = node.prev; 

	    System.out.print("📜 History: ");
	    while (node != null) {
	        if (node == current) {
	            System.out.print("[" + node.url + "] "); 
	        } else {
	            System.out.print(node.url + " ");
	        }
	        node = node.next;
	    }
	    System.out.println();
	}

	
	//method to get current page
	public String getCurrentPage() {
		return current.url ;
	}
}

package com.deliverychain;

public class DeliveryChainManagement {

	public Stage head ;
	
	//constructor
	public DeliveryChainManagement() {
		head = new Stage("Packed") ;
		Stage shipped = new Stage("Shipped") ;
		Stage inTransit = new Stage("In Transit") ;
		Stage delivered = new Stage("Delivered") ;
		
		head.next = shipped ;
		shipped.next = inTransit ;
		inTransit.next =  delivered ;
		
	}
	//method to track parcel, add checkpoints and mark a product as missing
	public void trackParcel () {
		Stage current = head;
	    System.out.println("Tracking parcel");
	    while (current != null) {
	        System.out.println("-> " + current.name);
	        current = current.next;  
	    }
	}
	
	public void addCheckpoint(String afterStage, String newStage) {
		Stage current = head ;
		while(current != null) {
			if(current.name.equalsIgnoreCase(afterStage)) {
				Stage checkpoint = new Stage(newStage) ;
				checkpoint.next = current.next ;
				current.next = checkpoint ;
				System.out.println("Checkpoint '" + newStage + "' added after '" + afterStage + "'");
                return;
			}
			
			current = current.next ;
		}
		 System.out.println("Stage '" + afterStage + "' not found!");

	}
	
	public void markMissing(String stageName) {
		 Stage current = head;
		    while (current != null) {
		        if (current.name.equalsIgnoreCase(stageName)) {
		            current.next = null;
		            System.out.println("Package lost at stage: " + stageName);
		            return;
		        }
		        current = current.next;
		    }
		    System.out.println("Stage " + stageName + " Not Found!");
	}
}

package com.traincomparision;

public class CompartmentNavigation {

	private Compartment head ;
	private Compartment tail ;
	
	//method to a new compartment
	public void addCompartment(String id, String service) {
		Compartment newCompt = new Compartment(id, service) ;
		if(head == null) {
			head = tail = newCompt ;
		}
		else {
			tail.next = newCompt ;
			newCompt.prev = tail;
			tail = newCompt ;
		}
		
		System.out.println("Added new Compartment : " +newCompt) ;
	}
	
	//method to remove a compartment
	public void removeCompartment(String id) {
		Compartment temp = head ;
		while(temp != null) {
			if(temp.id.equals(id)) {
				if(temp.prev != null) {
					temp.prev.next = temp.next ;
				}
				else {
					head = temp.next ;
				}
				if (temp.next != null) {
					temp.next.prev = temp.prev;
				}
                else {
                	tail = temp.prev;
                }

				System.out.println("Removed : Compartment [ id :" +id  +"]") ;
				return ;
			}
			temp = temp.next ;
			
		}
		System.out.println("\"Compartment \" + id + \" not found.\"") ;
	}
	
	//methods to traverse forward and backward in the compartments
	public void traverseForward() {
		Compartment temp = head ;
		while(temp != null) {
			System.out.println(temp) ;
			temp = temp.next ;
		}
	}
	
	public void traverseBackward() {
		Compartment temp = tail ;
		while(temp != null) {
			System.out.println(temp) ;
			temp = temp.prev ;
		}
	}
	
	//method to show adjacent compartments of all compartments
	public void showAdjacentCompartments (String id) {
		Compartment temp = head ;
		while (temp != null) {
            if (temp.id.equals(id)) {
                System.out.println("Current: " + temp);
                System.out.println("Previous: " + (temp.prev != null ? temp.prev : "None"));
                System.out.println("Next: " + (temp.next != null ? temp.next : "None"));
                return; 
            }
            temp = temp.next;
        }

		System.out.println("Compartment [id " +id +"] Not found!" ) ;
	}
}

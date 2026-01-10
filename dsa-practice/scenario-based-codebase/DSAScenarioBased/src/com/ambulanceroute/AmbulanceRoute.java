package com.ambulanceroute;

public class AmbulanceRoute {

	private Unit head ;
	
	//method to add a new unit
	public void addUnit(String name) {
		Unit newNode = new Unit(name) ;
		if(head == null) {
			head =  newNode ;
			head.next =  head ;
		}
		else {
			Unit temp = head ;
			while(temp.next != head) {
				temp = temp.next ;
			}
			temp.next = newNode ;
			newNode.next = head ;
		}
	}
	
	//method to remove an unit
	public void removeUnit(String name ) {
		if (head == null) {
            return;
        }

        Unit current = head, prev = null;
        do {
            if (current.name.equals(name)) {
                if (prev == null) {
                    Unit temp = head;
                    while (temp.next != head) {
                        temp = temp.next; 
                    }
                    head = head.next;     
                    temp.next = head;     
                } else {
                   
                    prev.next = current.next;
                }
                System.out.println("Unit " + name + " removed (Under maintenance)");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Unit " + name + " not found!");

		}
	
	//method to redirect patient to different unit
	public void redirectPatient() {
		if(head == null) {
			System.out.println( "No units available!") ;
			return ;
		}
		Unit current = head ;
		do {
			if(current.available) {
				System.out.println("Patient redirected to : "+ current.name) ;
				return ;
			}
			current = current.next ;
		}
		while(current != head) ;
		System.out.println("No available units !") ;
	}
	
	//method to set availability of a unit
	public void setAvailability(String name, boolean status) {
		Unit current = head ;
		if(current == null) {
			return ;
		}
		do {
			if(current.name.equals(name)) {
				current.available = status ;
				System.out.println("Unit " +name +" availability set to " +status) ;
				return ;
			}
			current = current.next ;
		}
		while(current != head) ;
	}
	
	//method to show route to different units
	
	public void showRoute() {
		if(head == null) {
			System.out.println("No units avaialable!") ;
			return ;
		}
		Unit temp = head ;
		System.out.println("Route") ;
		do {
			System.out.println(temp.name +(temp.available ? "Available" : "Not Avaialable")) ;
			temp = temp.next ;
		}
		while(temp != head) ;
		System.out.println(head.name + "(loop") ;
	}
	
}

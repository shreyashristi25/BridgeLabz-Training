package com.trafficmanager;
import java.util.* ;

public class RoundaboutVehicleFlow {

	private Vehicle head ;
	private Queue<Vehicle> waiting ;
	private int capacity ;
	
	//constructor
	public RoundaboutVehicleFlow(int queueCapacity) {
		head = null ;
		capacity = queueCapacity ;
		waiting = new LinkedList<>() ;
	}
	
	//methods to add vehicle to waiting queue, move vehicle from queue into roundabout
	public void enqueueVehicle(String id, String type) {
        if (waiting.size() == capacity) {
            System.out.println("Queue Overflow! Vehicle " + id + " cannot wait.");
            return;
        }
        waiting.add(new Vehicle(id, type));
        System.out.println("Vehicle " + id + " added to waiting queue.");
    }

    public void enterRoundabout() {
        if (waiting.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting.");
            return;
        }
        Vehicle v = waiting.poll();
        if (head == null) {
            head = v;
            head.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = v;
            v.next = head;
        }
        System.out.println("Vehicle " + v.id + " entered roundabout.");
    }
    
 
    //methods to remove vehicle from roundabout and print round state
    public void exitRoundabout(String id) {
        if (head == null) {
            System.out.println("Roundabout empty!");
            return;
        }
        Vehicle curr = head, prev = null;
        do {
            if (curr.id.equals(id)) {
                if (prev == null) { 
                    if (head.next == head) {
                        head = null; 
                    } else {
                        Vehicle temp = head;
                        while (temp.next != head) temp = temp.next;
                        temp.next = head.next;
                        head = head.next;
                    }
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Vehicle " + id + " exited roundabout.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
        System.out.println("Vehicle " + id + " not found in roundabout.");
    }

    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }
        System.out.print("Roundabout Vehicles: ");
        Vehicle temp = head;
        do {
            System.out.print(temp + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    //method to print waiting queue
    public void printQueue() {
        System.out.println("Waiting Queue: " + waiting);
    }



}

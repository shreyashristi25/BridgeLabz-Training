package com.linkedlist.circularlinkedlist.onlineticketreservation;

public class TicketReservationSystem {

	 private Ticket head;

	    // method to add ticket at end
	    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
	        Ticket newNode = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
	        if (head == null) {
	            head = newNode;
	            newNode.next = head; 
	        } else {
	            Ticket temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.next = head;
	        }
	        System.out.println("Ticket booked successfully for " + customerName + " (" + movieName + ")");
	    }

	    // method to remove ticket by ID
	    public void removeTicket(int ticketId) {
	        if (head == null) {
	            System.out.println("No tickets booked!");
	            return;
	        }
	        Ticket temp = head, prev = null;
	        do {
	            if (temp.ticketId == ticketId) {
	                if (temp == head && head.next == head) {
	                    head = null; 
	                } else if (temp == head) {
	                    Ticket last = head;
	                    while (last.next != head) {
	                        last = last.next;
	                    }
	                    head = head.next;
	                    last.next = head;
	                } else {
	                    prev.next = temp.next;
	                }
	                System.out.println("Ticket ID " + ticketId + " removed.");
	                return;
	            }
	            prev = temp;
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("Ticket not found!");
	    }

	    // method to display all tickets
	    public void displayTickets() {
	        if (head == null) {
	            System.out.println("No tickets booked!");
	            return;
	        }
	        Ticket temp = head;
	        System.out.println("Booked Tickets:");
	        do {
	            System.out.println("ID=" + temp.ticketId + ", Customer=" + temp.customerName +
	                    ", Movie=" + temp.movieName + ", Seat=" + temp.seatNumber +
	                    ", Time=" + temp.bookingTime);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    // method to search by Customer Name
	    public void searchByCustomer(String customerName) {
	        if (head == null) {
	            System.out.println("No tickets booked!");
	            return;
	        }
	        Ticket temp = head;
	        boolean found = false;
	        do {
	            if (temp.customerName.equalsIgnoreCase(customerName)) {
	                System.out.println("Found Ticket: ID=" + temp.ticketId + ", Movie=" + temp.movieName +
	                        ", Seat=" + temp.seatNumber + ", Time=" + temp.bookingTime);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);
	        if (!found) System.out.println("No ticket found for Customer: " + customerName);
	    }

	 // method to search by Movie Name
	    public void searchByMovie(String movieName) {
	        if (head == null) {
	            System.out.println("No tickets booked!");
	            return;
	        }
	        Ticket temp = head;
	        boolean found = false;
	        do {
	            if (temp.movieName.equalsIgnoreCase(movieName)) {
	                System.out.println("Found Ticket: ID=" + temp.ticketId + ", Customer=" + temp.customerName +
	                        ", Seat=" + temp.seatNumber + ", Time=" + temp.bookingTime);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);
	        if (!found) System.out.println("No ticket found for Movie: " + movieName);
	    }


	   // method to count total tickets
	    public void countTickets() {
	        if (head == null) {
	            System.out.println("Total tickets booked: 0");
	            return;
	        }
	        int count = 0;
	        Ticket temp = head;
	        do {
	            count++;
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("Total tickets booked: " + count);
	    }

	   
	    public static void main(String[] args) {
	        TicketReservationSystem system = new TicketReservationSystem();

	        // Add tickets
	        system.addTicket(101, "Ansh", "Fast and Furious", "A1", "2026-01-02 18:00");
	        system.addTicket(102, "Shruti", "End Game", "B2", "2026-01-02 19:00");
	        system.addTicket(103, "Arjun", "The Matrix", "C3", "2026-01-02 20:00");

	        // Display tickets
	        system.displayTickets();

	        // Search
	        system.searchByCustomer("Ansh");
	        system.searchByMovie("End Game");

	        // Count tickets
	        system.countTickets();

	        // Remove ticket
	        system.removeTicket(102);
	        system.displayTickets();
	        system.countTickets();
	 }
}



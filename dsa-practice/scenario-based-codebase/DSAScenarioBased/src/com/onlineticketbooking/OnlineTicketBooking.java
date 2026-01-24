package com.onlineticketbooking;
import java.util.* ;

public class OnlineTicketBooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		EventAVL event = new EventAVL() ;
		
		//taking user choice as input and displaying result accordingly
		while (true) {
            System.out.println("--- Online Ticket Booking ---");
            System.out.println("1. Add/Update Event");
            System.out.println("2. Cancel Event");
            System.out.println("3. Show Events");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter event name: ");
                    String name = sc.next();
                    
                    System.out.print("Enter event time (according to 24hr clock): ");
                    int time = sc.nextInt();
                    
                    event.insert(name, time);
                    
                    break;
                case 2:
                    System.out.print("Enter time to cancel event (according to 24hr clock) : ");
                    int eventTime = sc.nextInt();
                    event.cancel(eventTime);
                    break;
                case 3:
                	if(event != null) {
                		event.showEvents();
                	}
                	System.out.println("No Events Scheduled !") ;
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }

	}

}

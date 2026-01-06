package com.eventease;
import java.util.* ;
public class EventEase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking user input for organizer information
        System.out.print("Enter organizer name: ");
        String organizerName = sc.nextLine();
        
        System.out.print("Enter organizer email: ");
        String organizerEmail = sc.nextLine();
        
        User organizer = new User(organizerName, organizerEmail);

        //taking user input for event info
        System.out.print("Enter event type (Birthday/Conference): ");
        String type = sc.nextLine();

        System.out.print("Enter event ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter event name: ");
        String name = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Enter venue cost: ");
        double venueCost = sc.nextDouble();

        System.out.print("Enter service cost (0 if none): ");
        double serviceCost = sc.nextDouble();

        System.out.print("Enter discount (0 if none): ");
        double discount = sc.nextDouble();

        Event event = null;
        //checking for event and displaying result
        if (type.equalsIgnoreCase("Birthday")) {
            event = new BirthdayEvent(id, name, location, date, attendees, venueCost, serviceCost, discount);
        } 
        else if (type.equalsIgnoreCase("Conference")) {
            event = new ConferenceEvent(id, name, location, date, attendees, venueCost, serviceCost, discount);
        } 
        else {
            System.out.println("Invalid event type!");
            System.exit(0);
        }

        System.out.println("Organizer: " + organizer.getName() + " (" + organizer.getEmail() + ")");
        event.schedule();
        System.out.println("Total Cost: " + event.calculateCost());

        sc.close();


	}

}

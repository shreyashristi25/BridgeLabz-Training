package com.travellog;
import java.io.* ;
import java.util.* ;
import java.time.* ;


public class TravelLog {

	public static void main(String[] args) {
		TripOrganizer log = new TripOrganizer();
        Scanner sc = new Scanner(System.in);

        //taking user choice as input and displaying result accordingly
        while (true) {
            System.out.println("\n--- TravelLog Menu ---");
            System.out.println("1. Add Trip");
            System.out.println("2. Save Trips");
            System.out.println("3. Load Trips");
            System.out.println("4. Search Cities (Regex)");
            System.out.println("5. Trips > 5 days");
            System.out.println("6. Unique Countries");
            System.out.println("7. Top 3 Cities");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter city: ");
                        String city = sc.nextLine();
                        
                        System.out.print("Enter country: ");
                        String country = sc.nextLine();
                        
                        System.out.print("Enter start date (yyyy-mm-dd): ");
                        LocalDate start = LocalDate.parse(sc.nextLine());
                        
                        System.out.print("Enter end date (yyyy-mm-dd): ");
                        LocalDate end = LocalDate.parse(sc.nextLine());
                        
                        log.addTrip(new Trip(city, country, start, end));
                        break;

                    case 2: 
                    	log.saveTrips();
                    	break;
                    case 3: 
                    	log.loadTrips(); 
                    	break;
                    case 4:
                        System.out.print("Enter regex: ");
                        log.searchCities(sc.nextLine());
                        break;
                    case 5: 
                    	log.longTrips();
                    	break;
                    case 6: 
                    	log.uniqueCountries();
                    	break;
                    case 7: 
                    	log.topCities(); 
                    	break;
                    case 8: 
                    	System.exit(0);
                }
            } 
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


	}

}

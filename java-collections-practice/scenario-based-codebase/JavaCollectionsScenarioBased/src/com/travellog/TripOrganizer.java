package com.travellog;
import java.io.* ;
import java.time.* ;
import java.util.* ;
import java.util.regex.* ;


public class TripOrganizer {

	private List<Trip> trips = new ArrayList<>();
    private static final String FILE_NAME = "trips.dat";

    // methods to save trips into a file, load trips from the file add trips 
    public void saveTrips() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(trips);
            System.out.println("Trip Saved!") ;
        }
    }

    public void loadTrips() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            trips = (List<Trip>) ois.readObject();
            System.out.println("Trip Loaded!") ;
        }
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
        System.out.println("Trip Added!") ;
    }

    // method to search a trips
    public void searchCities(String regex) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Cities matching regex:");
        for (Trip t : trips) {
            if (pattern.matcher(t.getCity()).find()) {
                System.out.println(t.getCity());
            }
        }
    }
    
    // Trips longer than 5 days, unique countries visited and top three most visited countries
    public void longTrips() {
        System.out.println("Trips longer than 5 days:");
        for (Trip t : trips) {
            if (t.getDuration() > 5) {
                System.out.println(t);
            }
        }
    }

    public void uniqueCountries() {
        Set<String> countries = new HashSet<>();
        for (Trip t : trips) countries.add(t.getCountry());
        System.out.println("Unique countries: " + countries);
    }

    public void topCities() {
        Map<String, Integer> cityCount = new HashMap<>();
        for (Trip t : trips) {
            cityCount.put(t.getCity(), cityCount.getOrDefault(t.getCity(), 0) + 1);
        }

        cityCount.entrySet().stream()
                 .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                 .limit(3)
                 .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue() + " times"));
    }
}




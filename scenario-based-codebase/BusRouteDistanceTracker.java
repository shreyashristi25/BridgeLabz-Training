/*Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.* ;
public class  BusRouteDistanceTracker  {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		// Distances between stops stored in an array
        int [] stopDistances = {10, 13, 20, 15};
        double totalDistance = 0;
		int i = 0 ;
		
		while (i <= stopDistances.length) {
            int distance = stopDistances[i];
            totalDistance += distance;

			System.out.println() ;
            System.out.println("Bus has reached Stop " + (i+1) + 
                               ". Total distance so far: " + (totalDistance) + " km");

			System.out.println() ;
            System.out.print("Do you want to get off here? (yes/no): ");
            String choice = sc.next().toLowerCase();


            if (choice.equals("yes")) {
				System.out.println() ;
                System.out.println("Passenger exited at Stop " + (i+1));
				System.out.println() ;
                System.out.println("Total distance travelled: " +(totalDistance) + " km");
                break;
            }

            System.out.println() ;
            System.out.print("Do you want to continue to next stop? (yes to continue / exit to quit): ");
            String cont = sc.next().toLowerCase();

            if (cont.equals("exit")) {
				System.out.println() ;
                System.out.println("Passenger chose to exit the tracker.");
				System.out.println() ;
                System.out.println("Total distance travelled: " +(totalDistance) + " km");
                break;
            }

            i++;
			if(i == stopDistances.length ) {
				System.out.println("Reached the last stop!") ;
				System.out.println("Exiting.....") ;
			}
        }

        sc.close();
	
	}
}
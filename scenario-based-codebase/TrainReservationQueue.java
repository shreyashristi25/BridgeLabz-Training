
import java.util.* ;
public class TrainReservationQueue {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in) ;
	
        int totalSeats = 8;  
        int bookedSeats = 0;

        while (true) {
            System.out.println("=== Train Reservation Menu ===");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
			System.out.println() ;
			
            switch (choice) {
                case 1:
                    if (totalSeats > 0) {
                        bookedSeats++;
                        totalSeats--;
						System.out.println() ;
                        System.out.println("Ticket booked successfully!");
                        System.out.println("Remaining seats: " + totalSeats);
						system.out.println() ;
                        if (totalSeats == 0) {
                            System.out.println("All seats booked! Booking closed.");
                            break; 
                        }
                    } 
					else {
                        System.out.println("Oops! No seats available!");
                        break;
                    }
                    break;
					
				case 2:
                    System.out.println("Available seats: " + totalSeats);
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return; 

                default:
                    System.out.println("Invalid choice! Try again.");
            }

            if (totalSeats == 0) {
                System.out.println("Sorry for the inconvenience. Reservation system closed. No seats left.");
                break;
            }
        }
		sc.close() ;
    }
}



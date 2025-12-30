
import java.util.* ;
public class MovieTicketBooking {
	public static void main(String args []) {
		Scanner sc = new Scanner (System.in) ;
		
		int price = 0 ;
		int snackPrice = 0;
		int totalAmount = 0;
		int bookedSeats = 0;
		int totalSeats = 10 ;
		while(true) {
			System.out.println("=== Movie Theatre Menu ====") ;
			System.out.println("1. Movie Type") ;
			System.out.println("2. Snacks") ;
			System.out.println("3. Exit") ;
			System.out.println();
			System.out.println("Enter your choice :") ;
			int choice = sc.nextInt() ;
		
			switch(choice) {
				case 1 :
					System.out.println("-----Movie Types-----") ;
					System.out.println();
					System.out.println("1.Action") ;
					System.out.println("2.Romantic") ;
					System.out.println("3.Thriller") ;
					System.out.println("4.Comedy") ;
					System.out.println("5.Horror") ;
					System.out.println() ;
					if (totalSeats > 0){
						System.out.println("Enter your preference :") ;
						int pref = sc.nextInt() ;
						if(pref == 1) {
							bookedSeats ++ ;
							totalSeats-- ;
							System.out.println() ;
	
							System.out.println ("-----Seat Types-----") ;
							System.out.println ("1.Gold") ;
							System.out.println ("2.Silver") ;
							System.out.println("Enter your preference :") ;
							int option = sc.nextInt() ;
							if(option == 1) {
								price = 250 ;
							}
							else {
								price = 200 ;
							}
							
							System.out.println("Seat Booked Successfully!!") ;
						}
						else if(pref == 2) {
							bookedSeats ++ ;
							totalSeats-- ;
							System.out.println() ;
							System.out.println ("-----Seat Types-----") ;
							System.out.println ("1.Gold") ;
							System.out.println ("2.Silver") ;
							System.out.println("Enter your preference :") ;
							int option = sc.nextInt() ;
							if(option == 1) {
								price = 250 ;
							}
							else {
								price = 200 ;
							}
			
							System.out.println("Seat Booked Successfully!!") ;
						}
						else if(pref == 3) {
							bookedSeats ++ ;
							totalSeats-- ;
							System.out.println() ;
							System.out.println ("-----Seat Types-----") ;
							System.out.println ("1.Gold") ;
							System.out.println ("2.Silver") ;
							System.out.println("Enter your preference :") ;
							int option = sc.nextInt() ;
							if(option == 1) {
								price = 250 ;
							}
							else {
								price = 200 ;
							}
			
							System.out.println("Seat Booked successfully") ;
						}
						else if(pref == 4) {
							bookedSeats ++ ;
							totalSeats-- ;
							System.out.println() ;
							System.out.println ("-----Seat Types-----") ;
							System.out.println ("1.Gold") ;
							System.out.println ("2.Silver") ;
							System.out.println("Enter your preference :") ;
							int option = sc.nextInt() ;
							if(option == 1) {
								price = 250 ;
							}
							else {
								price = 200 ;
							}
					
							System.out.println("Seat Booked Successfully!!") ;
						}
						else if(pref == 5) {
							bookedSeats ++ ;
							totalSeats-- ;
							System.out.println() ;
							System.out.println ("-----Seat Types-----") ;
							System.out.println ("1.Gold") ;
							System.out.println ("2.Silver") ;
							System.out.println("Enter your preference :") ;
							int option = sc.nextInt() ;
							if(option == 1) {
								price = 250 ;
							}
							else {
								price = 200 ;
							}
					
							System.out.println("Seat Booked Successfully!!") ;
						}
						else {
							System.out.println("Invalid choice! choose from the above options.") ;
						}
					}
					if (totalSeats == 0) {
						System.out.println() ;
						System.out.println("All seats booked! Booking closed.");
						break; 
					}
					break ;
				
				case 2:
					System.out.println() ;
					System.out.println ("-----List of snacks-----") ;
					System.out.println ("1.Popcorn") ;
					System.out.println ("2.Candy") ;
					System.out.println ("3.Nachos") ;
					System.out.println("Enter your preference :") ;
					int pick = sc.nextInt() ;
					if(pick == 1) {
						snackPrice = 150 ;
					}
					else if (pick == 2) {
						snackPrice = 100 ;
					}
					else if ( pick == 3) {
						snackPrice = 120 ;
					}
					break ;
				case 3 :
					System.out.println("Exiting......") ;
					totalAmount = price + snackPrice ;
					System.out.println() ;
					System.out.println("---------------BILL---------------") ;
					System.out.println("Movie Ticket Price : \t" + price) ;
					System.out.println("Snacks Price : \t\t" + snackPrice) ;
					System.out.println("Total Amount : \t\t" +totalAmount) ;
					System.out.println("--------------------------------------") ;
					System.out.println("Thank you!") ;
					System.out.println("Visit Again :) ") ;
					System.out.println() ;
					break;
				default :
					System.out.println() ;
					System.out.println("Invalid choice! choose from the above options") ;
					break;
			}
			if (totalSeats == 0) {
				System.out.println() ;
				System.out.println("Oops! No seats left.");
				System.out.println() ;
				break;
			}
		}
		totalAmount = price + snackPrice ;
		System.out.println() ;
		System.out.println("---------------BILL---------------") ;
		System.out.println("Movie Ticket Price : \t" + price) ;
		System.out.println("Snacks Price : \t\t" + snackPrice) ;
		System.out.println("Total Amount : \t\t" +totalAmount) ;
		System.out.println("--------------------------------------") ;
		System.out.println("Thank you!") ;
		System.out.println("Visit Again :) ") ;
		
		sc.close() ;
	}
}  

import java.util.* ;
public class ParkingLotGateSystem {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in) ;
	
		//creating variables exit, capacity 
		boolean exit = false;
		int capacity = 20 ;
		int occupied = 0 ;
	
		//Looping and checking for user's choice using switch statement and displaying results accordingly
		
		while(!exit && occupied < capacity) {
		
		System.out.println("---Parking Lot Menu---") ;
		System.out.println ("Choose an option : ") ;
		System.out.println("1. Park") ;
		System.out.println("2. Exit") ;
		System.out.println("3. Show Occupancy") ; 
		
		System.out.println("Enter your choice :") ;
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				if(occupied < capacity) {
					occupied++ ;
					System.out.println("Parked Successfuly!") ;
				}
				else{
					System.out.println("Cannot park! Capacity full") ;
				}
				break ;
				
			case 2:
					exit = true ;
					System.out.println("Exiting the parking lot!") ;
				break ; 
				
			case 3:
				System.out.println("Occupancy of the parking lot :" +occupied / capacity) ;
				break ;
				
			default:
				System.out.println("Invalid Input!") ;
				break ;
		}
		
		if(occupied == capacity) {
			System.out.println ("The parking lot is full!") ;
		}
	
		}
		sc.close() ;
	}
	
}
package com.streamapi.eventatendee;
import java.util.* ;

public class EventAttendeeWelcomeMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		List<String> guests = new ArrayList<>() ;
		
		//taking number of guests and their name as user input 
		System.out.println("Enter number of guests : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		//printing welcome message for each guest
		for(int i =0; i <n; i++) {
			System.out.println("Enter name of guests : ") ;
			String name = sc.nextLine();
			
			guests.add(name) ;
			
			guests.stream()
			.skip(guests.size()-1)
			.forEach(x-> System.out.println("Welcome " +x+" !"));
		}
		sc.close();
		

	}

}

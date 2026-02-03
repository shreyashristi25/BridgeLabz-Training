package com.streamapi.filteringexpiringmemberships;
import java.util.* ;
import java.time.* ;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GymMembership {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		List<Member> members = new ArrayList<>() ;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		//taking number of members in the gym from user 
		System.out.println("Enter number of members : ") ;
		int n = sc.nextInt();
		sc.nextLine() ;
		
		//taking name of member and membership expiry date as user input 
		for(int i =0; i < n; i++) {
			System.out.println("Enter the name of member : ") ;
			String name  = sc.nextLine() ;
			
			System.out.println("Enter expiry date  : ") ;
			String date = sc.nextLine();
			LocalDate expiryDate = LocalDate.parse(date, formatter) ;
			
			members.add(new Member(name, expiryDate)) ;
		}
		
		LocalDate today = LocalDate.now() ;
		
		//filtering the list on the basis of expiry 
		List<Member> expiringSoon = members.stream()
	            .filter(m -> {
	                long daysUntilExpiry = ChronoUnit.DAYS.between(today, m.getExpiryDate());
	                return daysUntilExpiry >= 0 && daysUntilExpiry <= 30;
	            })
	            .collect(Collectors.toList());

		//displaying result
		System.out.println("Members whose membership expires within 30 days : ") ;
		if(expiringSoon.isEmpty()) {
			System.out.println("None") ;
		}
		else {
			expiringSoon.forEach(System.out :: println) ;
		}

		sc.close( ) ;
		
	}

}

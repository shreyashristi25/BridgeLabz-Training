package com.streamapi.filteringexpiringmemberships;
import java.time.* ;

public class Member {

	private String name ;
	private LocalDate expiryDate ;
	
	//constructor
	public Member(String name, LocalDate expiryDate) {
		this.name = name ;
		this.expiryDate = expiryDate ;
		
	}
	
	//getter methods to get name and expiry date 
	public String getName() {
		return name ;
	}
	
	public LocalDate getExpiryDate() {
		return expiryDate ;
	}
	
	@Override
	public String toString() {
		return name +" (expires : " +expiryDate +" )" ;
	}
}

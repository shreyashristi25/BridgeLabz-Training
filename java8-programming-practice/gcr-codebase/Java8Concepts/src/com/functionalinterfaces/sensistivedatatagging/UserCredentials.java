package com.functionalinterfaces.sensistivedatatagging;

public class UserCredentials implements SensitiveData{

	private String username ;
	private String password ;
	
	//constructor
	public UserCredentials(String username, String password) {
		this.username = username ;
		this.password= password ;
	}
	
	@Override
	public String toString() {
		return "UserCredentials{username='" + username + "', password='****'}";
	}
}

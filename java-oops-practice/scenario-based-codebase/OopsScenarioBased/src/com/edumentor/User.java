package com.edumentor;

public abstract class User {

	//protected variables to ensure limited access
	protected String name;
	protected String email ;
	protected String userId ;
	
	//constructor
	public User(String name, String email, String userId) {
		this.name =  name;
		this.email = email ;
		this.userId = userId ;
	}
	
	public void displayInfo() {} ;
	
}

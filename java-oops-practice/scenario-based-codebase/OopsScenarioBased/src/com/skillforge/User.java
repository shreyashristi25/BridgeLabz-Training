package com.skillforge;

public class User {

	//private variables to ensure limited access
	private String name;
    private String email;

    //constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //getter methods to get name and email
    public String getName() {
    	return name; 
    }
    public String getEmail() {
    	return email; 
    }

}

package com.annotation.jasonfield;

public class User {

	 @JsonField(name = "user_name")
	 private String username;
	 
	 @JsonField(name = "email_id")
	 private String email;

	 @JsonField(name = "age")
	 private int age;

	 //constructor
	 public User(String username, String email, int age) {
		 this.username = username;
		 this.email = email;
		 this.age = age;
	 }

}

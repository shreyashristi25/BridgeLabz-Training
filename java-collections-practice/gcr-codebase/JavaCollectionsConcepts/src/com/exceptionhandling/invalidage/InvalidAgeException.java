package com.exceptionhandling.invalidage;

//creating class to define a custom exception
public class InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {
		super(message) ;
	}
}

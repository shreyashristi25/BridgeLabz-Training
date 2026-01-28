package com.junit.main.passwordvalidator;

public class PasswordValidator {

	//method to check if the password is valid
	public boolean isValid(String password) {
		if(password == null) {
			return false ;
		}
		
		if(password.length() < 8) {
			return false ;
		}
		
		boolean hasUpperCase = password.chars().anyMatch(Character :: isUpperCase) ;
		boolean hasDigit = password.chars().anyMatch(Character :: isDigit) ;
		return hasUpperCase && hasDigit ;
	}
}

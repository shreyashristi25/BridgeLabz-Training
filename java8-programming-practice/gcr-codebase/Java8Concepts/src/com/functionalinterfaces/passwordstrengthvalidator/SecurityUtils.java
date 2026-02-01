package com.functionalinterfaces.passwordstrengthvalidator;

public interface SecurityUtils {

	static boolean checkPasswordStrength(String password) {
		//defining rules for validation and checking for password strength
		if(password == null) {
			return false ;
		}
		
		if(password.length() < 8) {
			return false ;
		}
		
		if (!password.matches(".*[A-Z].*")) {
			return false;
		}

        if (!password.matches(".*[a-z].*")) {
        	return false;
        }

        if (!password.matches(".*\\d.*")) {
        	return false;
        }

        if (!password.matches(".*[@#$%^&+=!].*")) {
        	return false;
        }

        return true;

	}
}

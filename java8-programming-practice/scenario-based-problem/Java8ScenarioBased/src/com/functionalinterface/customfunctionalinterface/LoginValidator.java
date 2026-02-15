package com.functionalinterface.customfunctionalinterface;


@FunctionalInterface
public interface LoginValidator {

	boolean validate(String userName,String password) ;
}

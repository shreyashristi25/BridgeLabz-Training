package com.optionalinterface.employeeofficemanagemnt;

public class EmployeeNotFoundException extends RuntimeException{

	EmployeeNotFoundException(String message) {
        super(message);
    }

}

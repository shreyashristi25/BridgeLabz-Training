package com.optionalinterface.employeeofficemanagemnt;
import java.util.* ;

public class Employee {

	int id;
    String name;
    Optional<String> manager;
    Optional<Double> bonus;
    Optional<String> email;
    Optional<String> insurance;
    Optional<String> middleName;

    //constructor
    public Employee(int id, String name, String manager, Double bonus, String email, String insurance, String middleName) {
        this.id = id;
        this.name = name;
        this.manager = Optional.ofNullable(manager);
        this.bonus = Optional.ofNullable(bonus);
        this.email = Optional.ofNullable(email);
        this.insurance = Optional.ofNullable(insurance);
        this.middleName = Optional.ofNullable(middleName);
    }

}

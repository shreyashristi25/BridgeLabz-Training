package com.campusconnect;

public abstract class Person {

	//protected variables
	protected int id;
    protected String name;
    protected String email;

    //constructor
    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //abstract method
    public abstract void printDetails();
}

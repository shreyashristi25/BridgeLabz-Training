package com.reflection.objectmapper;

public class Student {

	//private variables to ensure limited access
	private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

}

package com.inheritance;

public class Animal {
	
	//creating name and age variables 
	String name;
    int age;

    //constructor of Animal class
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //creating makeSound method
    void makeSound() {
        System.out.println("Generic animal sound");
    }

}

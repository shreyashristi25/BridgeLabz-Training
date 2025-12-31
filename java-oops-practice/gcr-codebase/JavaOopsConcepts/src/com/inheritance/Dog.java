package com.inheritance;

//creating dog as subclass of Animal class 
public class Dog extends Animal {
	
	Dog(String name, int age) {
        super(name, age);
    }

	//overriding makeSound method
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }

}

package com.inheritance;

public class Cat extends Animal {
	
	//constructor of cat class
	Cat (String name, int age) {
		super(name, age) ;
	}
	
	//overriding makeSound method of animal class
	@Override
	void makeSound() {
		        System.out.println(name + " says: Meow!");
	}
}

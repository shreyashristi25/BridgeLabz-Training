package com.petpal;

//creating Cat as subclass of Pet
public class Cat extends Pet{

	//constructor
	public Cat(String name, int age) {
        super(name, "Cat", age);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

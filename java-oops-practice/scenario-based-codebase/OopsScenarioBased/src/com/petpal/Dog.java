package com.petpal;
//creating Dog as the subclass of Pet
public class Dog extends Pet{

	//constructor
	public Dog(String name, int age ) {
		super(name, "Dog", age) ;
	}
	@Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

}

package com.inheritance;

public class AnimalHierarchy {
	
	public static void main(String[] args) {
        // Polymorphism in action
        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Whiskers", 2);
        Animal a3 = new Bird("Tweety", 1);

        // Each call resolves to the subclass implementation
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }

}

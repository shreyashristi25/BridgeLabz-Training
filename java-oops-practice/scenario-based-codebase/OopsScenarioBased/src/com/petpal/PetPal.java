package com.petpal;
import java.util.* ;
public class PetPal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;

		//Taking user input for pet's information
		System.out.print("Enter pet type (Dog/Cat/Bird): ");
        String type = sc.nextLine();

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        Pet pet = null;
        switch (type.toLowerCase()) {
            case "dog":
                pet = new Dog(name, age);
                break;
            case "cat":
                pet = new Cat(name, age);
                break;
            case "bird":
                pet = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid pet type!");
                System.exit(0);
        }

        pet.makeSound();
        pet.feed();
        pet.play();
        pet.sleep();
        pet.showStatus();
        
        sc.close();

	}

}

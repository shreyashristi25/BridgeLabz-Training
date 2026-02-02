package com.functionalinterfaces.cloningprototypeobjects;
import java.util.* ;

public class PrototypeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking input from user and performing task accordingly
        
        System.out.print("Enter vehicle model: ");
        String model = sc.nextLine();

        System.out.print("Enter vehicle speed: ");
        int speed = sc.nextInt();

        Vehicle original = new Vehicle(model, speed);

        try {
            // Cloning the object
            Vehicle cloned = (Vehicle) original.clone();

            System.out.println("Original Object: " + original);
            System.out.println("Cloned Object:   " + cloned);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
        }

        sc.close();


	}

}

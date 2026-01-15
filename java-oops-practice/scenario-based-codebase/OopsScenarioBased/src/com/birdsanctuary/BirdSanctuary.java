package com.birdsanctuary;
import java.util.* ;

public class BirdSanctuary {

	private List<Bird> birds = new ArrayList<>();

	//methods to add remove and display details of the bird 
    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void removeBirdById(String id) {
        birds.removeIf(b -> b.getId().equals(id));
    }

    public void displayAllBirds() {
        for (Bird b : birds) {
            b.displayDetails();
        }
    }

    public void displayFlyingBirds() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
        }
    }

    public void displayBoth() {
        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                ((Flyable) b).fly();
                ((Swimmable) b).swim();
            }
        }
    }

    //method to generate and display report
    public void sanctuaryReport() {
        int flyable = 0, swimmable = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean canFly = b instanceof Flyable;
            boolean canSwim = b instanceof Swimmable;

            if (canFly && canSwim) { 
            	both++ ;
            }
            else if (canFly)  {
            	flyable++;
            }
            else if (canSwim) {
            	swimmable++;
            }
            else {
            	neither++;
            }
        }

        System.out.println("Report -> Flyable: " + flyable+ ", Swimmable: " + swimmable + ", Both: " + both +", Neither: " + neither);
    }

}

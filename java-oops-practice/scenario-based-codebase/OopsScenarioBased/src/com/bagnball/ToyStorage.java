package com.bagnball;
import java.util.* ;
public class ToyStorage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for bag id, color and capacity
		System.out.println("Enter bag ID, Color, and Capacity : ") ;
		int bagId = sc.nextInt() ;
		String bagColor = sc.next();
		int bagCapacity = sc.nextInt() ;
		Bag bag = new Bag(bagId, bagColor, bagCapacity) ;
		
		//taking user choice, calling methods and displaying result accordingly
		int choice ;
		do {
			System.out.println("--- Bag-n-Ball Organizer Menu ---");
            System.out.println("1. Add Ball");
            System.out.println("2. Remove Ball");
            System.out.println("3. Display Balls");
            System.out.println("4. Display Bag Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Ball ID, Color, Size:");
                    int ballId = sc.nextInt();
                    String ballColor = sc.next();
                    String ballSize = sc.next();
                    Ball ball = new Ball(ballId, ballColor, ballSize);
                    bag.addBall(ball);
                    break;

                case 2:
                    System.out.println("Enter Ball ID to remove:");
                    int removeId = sc.nextInt();
                    bag.removeBall(removeId);
                    break;

                case 3:
                    bag.displayBalls();
                    break;

                case 4:
                    bag.displayBagInfo();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
		while (choice != 5);

        sc.close();

		
	}

}

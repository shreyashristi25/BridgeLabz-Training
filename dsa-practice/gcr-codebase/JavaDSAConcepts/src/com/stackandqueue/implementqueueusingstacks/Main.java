package com.stackandqueue.implementqueueusingstacks;
import java.util.* ;

//driver class for QueueUsingStack
public class Main {

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in) ;
		QueueUsingStacks q = new QueueUsingStacks();

		int choice;

        do {
            System.out.println("--- Queue Using Two Stacks ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    System.out.println(q.isEmpty() ? "Queue is empty" : "Queue is not empty");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
	}

}


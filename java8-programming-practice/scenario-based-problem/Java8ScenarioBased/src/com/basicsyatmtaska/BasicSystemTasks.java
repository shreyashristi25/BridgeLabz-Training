package com.basicsyatmtaska;
import java.util.* ;

public class BasicSystemTasks {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Run a task in a separate thread
        Thread t = new Thread(() -> {
            System.out.println("Task running in a separate thread...");
        });
        t.start();

        // Print numbers from a list
        System.out.print("\nEnter number of elements in list: ");
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.println("\n--- Numbers in List ---");
        numbers.forEach(num -> System.out.println(num));

        //Check even/odd
        System.out.print("\nEnter a number to check Even/Odd: ");
        int num = sc.nextInt();
        EvenOdd evenOdd = (x) -> x % 2 == 0 ? "Even" : "Odd";
        System.out.println(num + " is " + evenOdd.check(num));

        //Add two numbers
        System.out.print("\nEnter two numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add add = (x, y) -> x + y;
        System.out.println("Sum: " + add.sum(a, b));

        // Find greater of two numbers
        System.out.print("\nEnter two numbers to find greater: ");
        int g1 = sc.nextInt();
        int g2 = sc.nextInt();
        Greater greater = (x, y) -> x > y ? x : y;
        System.out.println("Greater: " + greater.max(g1, g2));

        sc.close();
    }

}

package com.stackandqueue.circulartourproblem;
import java.util.* ;

//driver class for CircularTour class
public class CircularTourMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating object, accessing methods and displaying result
		CircularTour c = new CircularTour() ;
		
		//taking user input
        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        int [] petrol = new int[n];
        int [] distance = new int[n];

        System.out.println("Enter petrol and distance for each pump:");
        for (int i = 0; i < n; i++) {
            petrol[i] = sc.nextInt();
            distance[i] = sc.nextInt();
        }

        int start = c.findStartingPump(petrol, distance);

        if (start == -1) {
            System.out.println("No solution exists. Cannot complete circular tour.");
        } else {
            System.out.println("Start at pump index: " + start);
        }

        sc.close();


	}

}

package com.dailystepcountranking;
import java.util.* ;

public class FitnessTracker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of people, their name and their step counts
		System.out.println("Enter number of people : ") ;
		int n = sc.nextInt();
		sc.nextLine();
		
		Person [] person = new Person[n] ;
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the name of the person : ") ;
			String name = sc.nextLine();
			
			System.out.println("Enter number of steps of the person : ") ;
			int steps = sc.nextInt();
			sc.nextLine();
			
			person[i] = new Person(name, steps) ;
		}
		
		//creating object of StepCountSorting class and displaying result 
		StepCountSorting count = new StepCountSorting() ; 
		count.bubbleSort(person) ;
		System.out.println("=== Daily step count Ranking ===") ;
		for(int i = 0; i < n ; i++) {
			System.out.printf("Rank %d: %s - %d steps\n", (i + 1), person[i].name, person[i].steps);
	        
		}

	}

}

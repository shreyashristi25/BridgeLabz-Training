/*Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.*/

import java.util.* ;
public class FitnessChallengeTracker {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in) ;
		
		//creating arrays to store total days in a week
		int [] pushUps = new int[7] ;
		String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday", "Sunday"} ;
		int count = 0;
		int target = 200 ;
		
		//getting user input and displaying the number of push-ups per day
		System.out.println("Enter number of push ups done in each of the week") ;
		for(int i = 0; i < 7; i++) {
			System.out.println("Day" +(i+1) +" : ") ;
			pushUps[i] = sc.nextInt() ;
			if(pushUps[i] == 0) {
				continue ;
			}
			
			if (days[i].length() >= 8) {   
				System.out.print(days[i] + "\t");
			}
			else {
				System.out.print(days[i] + "\t\t");
			}
			
			System.out.println("Yay! " +pushUps[i] +" push-ups today.");
		}
		
		//counting the total and average number of push-ups in a week and displaying result
		for(int p : pushUps) {
			count += p ;
		}
		int avg = count/7 ;
		
		System.out.println();
		System.out.println("The total number of push-ups this week :" +count +" "+"Well done!") ;
		System.out.println("The average number of psuh-ups this week :" +avg) ;
		System.out.println() ;
		if(count >= target) {
			System.out.println("Well Done! You completed your weekly target.") ;
		}
		else {
			System.out.println("You are close to acheiving your weekly target. Keep it up!" ) ;
		}
		
		
	}
}
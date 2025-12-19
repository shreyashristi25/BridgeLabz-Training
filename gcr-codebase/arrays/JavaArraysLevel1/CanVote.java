
import java.util.* ;
public class CanVote {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating array named age to store the age of students and getting user input 
		int [] age = new int[10] ;
		System.out.println("Enter the age of 10 students : ") ;
		for(int i = 0; i < age.length; i++) {
			age[i] = input.nextInt() ;
		}
		
		//checking if the student can vote or not 
		for (int i = 0; i < age.length; i++) {
			if (age[i] < 0) {
				System.out.println ("Invalid input : ") ;
			}
			else {
				if(age[i] >= 18) {
					System.out.println("The student with the age " +age[i] +" can vote.") ;
				}
				else {
					System.out.println("The student with the age " +age[i] +" cannot vote.") ;	
				}
			}
		}
		
		input.close() ;
	}
}
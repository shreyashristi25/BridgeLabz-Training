
import java.util.* ;
public class ElectionBooth {
	
	public static boolean canVote(int age ) {
		if(age >= 18) {
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in) ;
		int age = 1, count = 0 ; 
		while(age != 0) {
			System.out.println("Enter the age of candidate (Enter 0 to exit):") ;
			age = sc.nextInt() ;
			if(age <= 0) {
				System.out.println("Invalid Input! Please enter a positive ineteger.") ;
				break ;
			}
			if(canVote(age)) {
				count++ ;
			}
		}
		System.out.println("The number of votes are :" +count) ;
		
		sc.close() ;
	}
}
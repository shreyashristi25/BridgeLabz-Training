
import java.util.* ;
public class PositiveNegativeZero {
	
	//creating methods named checkingPOsitiveNegativeZero
	public int checkingPositiveNegativeZero(int n) {
		if (n < 0) {
			return -1 ;
		}
		else if (n > 0) {
			return 1 ;
		}
		else {
			return 0 ;
		}
	}
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//getting number as input from user and checking for positive, negative and zero
		System.out.println("Enter a number : ") ;
		int number = input.nextInt();
		PositiveNegativeZero positveNegativeZero = new PositiveNegativeZero() ;
		int  result = positveNegativeZero.checkingPositiveNegativeZero(number) ;
		if(result == -1){
		System.out.println("The number " +number +" is negative" ) ;
		}
		else if (result == 0) {
			System.out.println("The number " +number +" is zero" ) ;
		}
		else {
			System.out.println("The number " +number +" is positive" ) ;
		}
    input.close() ;
	  
   }
}
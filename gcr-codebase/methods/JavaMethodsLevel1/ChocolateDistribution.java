
import java.util.* ;
public class ChocolateDistribution {

	//creating a method findRemainderAndQuotient to check for quotient and reminder
	public static int[] findRemainderAndQuotient(int number, int divisor) {
	 int [] arr = new int [2] ;
	 arr[0] = number / divisor ;
	 arr[1] = number % divisor ;
	 return arr ;
	}
	public static void main (String args []) {
		//creating variables N and M and taking user input
		Scanner input = new Scanner (System.in) ;
		int N, M ;
		System.out.println ("Enter the number of chocolates : ") ;
		N = input.nextInt() ;
		System.out.println ("Enter number of children : ") ;
		M = input.nextInt() ;
	
		if (M == 0) {
            System.out.println("Invalid input! : Please enter number of children as positive integer");
        } else {
            int [] array = findRemainderAndQuotient(N, M) ;

            System.out.println("Each child gets " + array[0] + " number of chocolates.");
            System.out.println("Remaining chocolates are : " + array[1]);
        }


	}
}
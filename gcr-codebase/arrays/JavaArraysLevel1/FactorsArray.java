
import java.util.* ;
public class FactorsArray {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating varibale number, maxFactor and array named factors
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int maxFactor = 10 ;
		int [] factors = new int[maxFactor] ;
		int index = 0 ;
		
		for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; 
                }
                factors[index] = i;
                index++;
            }
        }
		System.out.println("The factors of number " +number +" are :" ) ;
		for(int x : factors) {
			System.out.println(x) ;
		}
		
		input.close() ;
	}
}
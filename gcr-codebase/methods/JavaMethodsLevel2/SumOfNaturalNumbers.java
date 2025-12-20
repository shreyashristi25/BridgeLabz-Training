
import java.util.Scanner ;
public class SumOfNaturalNumbers {

    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1 ;
        }
        return (n + recursiveSum(n - 1)) ;
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2 ;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in) ;

        System.out.print("Enter a number: ") ;
        int n = Input.nextInt() ;
        if (n <= 0) {
            System.out.println("Please enter a positive natural number!") ;
        } else {
            int recursiveResult = recursiveSum(n) ;
            int formulaResult = formulaSum(n)  ;
			if(recursiveResult == formulaResult) {
				System.out.println("Sum of first " + n + " natural numbers (using recursive method) is : " + recursiveResult) ;
				System.out.println("Sum of first " + n + " natural numbers (using formula) is : " + formulaResult)  ;
			}
			else {
				System.out.println("Results using recursivefunction and formula do not match.") ;
			}
		}

        Input.close() ;
    }
}


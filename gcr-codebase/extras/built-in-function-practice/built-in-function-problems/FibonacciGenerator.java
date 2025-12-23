
import java.util.* ;
public class FibonacciGenerator {

    // creating a method to print fibonacci sequence
    public static void printFibonacci(int n) {
        int first = 0, second = 1 ;
        System.out.print("Fibonacci sequence: ") ;

        for (int i = 1 ; i <= n ; i++) {
            System.out.print(first + " ") ;
            int next = first + second ;
            first = second ;
            second = next ;
        }
        System.out.println() ; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
		
		//getting user input and displaying result
        System.out.print("Enter the number of terms: ") ;
        int terms = input.nextInt() ;

        printFibonacci(terms) ;

        input.close() ;
    }
}

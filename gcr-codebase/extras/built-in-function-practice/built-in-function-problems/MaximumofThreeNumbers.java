
import java.util.* ;
public class MaximumofThreeNumbers {

   //creating method findMax to check for maximum of three numbers
    
	public static int findMax(int a, int b, int c) {
        int max = a ;
        if (b > max) max = b ;
        if (c > max) max = c ;
        return max ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
		
		//taking user input to find maximum and displaying the maximum of three 
        System.out.print("Enter first number: ") ;
        num1 = input.nextInt() ;

        System.out.print("Enter second number: ") ;
        num2 = input.nextInt() ;

        System.out.print("Enter third number: ") ;
        num3 = input.nextInt() ;
		
        int max = findMax(num1, num2, num3) ;

        System.out.println("The maximum of the three numbers is: " + max) ;

        input.close() ; 
    }
}


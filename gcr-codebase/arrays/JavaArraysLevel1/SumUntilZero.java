
import java.util.* ;
public class SumUntilZero {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating varibales numbers and total
		double [] numbers  = new double[10] ;
		double total = 0.0 ;
		int index = 0 ;
		
		//getting inputs until 0 or negative is entered by the user and displaying total as output
		while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();
            if (num <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array limit reached (10 numbers).");
                break;
            }
            numbers[index] = num;
            index++;
        }
		
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
		System.out.println("The total sum of the numbers entered is : " +total) ;
		input.close() ;
	}
}

import java.util.* ;
public class BmiCalculator {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variables weight, height and bmi
	    
		System.out.println("Enter your weight in kg : ") ;
		double weight = input.nextDouble() ;
		System.out.println("Enter your height in cm : ") ;
		double height = input.nextDouble() ;
		double heightMeter = height / 100 ;
		double bmi =  weight / (heightMeter * heightMeter) ;
		
		// checking the bmi to evaluate the weigth status
		if(bmi <18.4) {
			System.out.println("The bmi of the person is " +bmi +" -The Person is Underweight ") ;
		}
		else if (bmi >=18.5 && bmi < 24.9) {
			System.out.println("The bmi of the person is " +bmi +" -The person's weight is normal") ;
		}
		else if (bmi >=25.0 && bmi < 39.9) {
			System.out.println("The bmi of the person is " +bmi +" -The person is Overweight") ;
		}
		else {
			System.out.println("The bmi of the person is " +bmi +" -The person is Obese") ;
		}
		
		input.close() ;
		}
}
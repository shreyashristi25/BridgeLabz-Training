
import java.util.* ;
public class BMIFitnessTracker {
	public static void main(String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting input of weight and height to check the BMI
		System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

	  input.close() ;
	}
}
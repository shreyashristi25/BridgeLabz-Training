
import java.util.*;
public class BmiUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creating variable n showing number of persons and arrays weight, height, bmi and weightStatus and getting user input
        System.out.print("Enter the number of persons in the team: ") ;
        int n = input.nextInt() ;
        double[] weight = new double[n] ;
        double[] height = new double[n] ;
        double[] bmi = new double[n] ;
        String[] weightStatus = new String[n] ;
		
		for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " +(i+1) +" in kg : ") ;
            weight[i] = input.nextDouble() ;
			System.out.print("Enter height of person " +(i+1) +" in meter : ") ;
            height[i] = input.nextDouble() ;
            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input! Weight and height must be positive. Try again.") ;
            }
        }
		
		//Calculating the BMI and weight status and displaying the BMI report
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]) ;

            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight" ;
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight" ;
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight" ;
            } else {
                weightStatus[i] = "Obese" ;
            }
        }
        System.out.println(" BMI Report ") ;
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) +"'s Height is: " + height[i] + " m," +
			" Weight: " + weight[i] + " kg," +" BMI is : " + bmi[i] +", WeightStatus: " + weightStatus[i]) ;
        }

        input.close();
    }
}




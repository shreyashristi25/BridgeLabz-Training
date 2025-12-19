
import java.util.*;
public class BmiUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating variable number and getting user input and creating arrays named personData and weightStatus and getting user input
        System.out.print("Enter the number of persons in the team: ");
        int number = input.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        //getting user input in arrays, calculating bmi and determining weight status
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " +(i+1) +" in kg : ") ;
            double weight = input.nextDouble() ;
			System.out.print("Enter height of person " +(i+1) +" in meter : ") ;
            double height = input.nextDouble() ;
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input! Weight and height must be positive. Try again.") ;
            }
         
            personData[i][0] = weight;
            personData[i][1] = height;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println(" BMI Report ");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +"'s Height is: " + personData[i][1] + " m," +
			" Weight: " + personData[i][0] + " kg," +" BMI is : " +  personData[i][2] +", WeightStatus: " + weightStatus[i]) ;
        }

        input.close();
    }
}



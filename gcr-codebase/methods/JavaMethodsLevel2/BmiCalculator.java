
import java.util.*    ;
public class BmiCalculator {

	//creating variables and methods to check weight status of the team 
	public static void calculateBMI(double[][] data) {
        for (int i = 0 ; i < data.length ; i++) {
            double weight = data[i][0] ;         
            double heightCm = data[i][1] ;        
            double heightM = heightCm / 100.0 ;   
            double bmi = weight / (heightM * heightM) ;
            data[i][2] = bmi ;
        }
    }
	public static String[] checkStatus(double[][] data) {
        String[] status = new String[data.length] ;

        for (int i = 0 ; i < data.length ; i++) {
            double bmi = data[i][2] ;

            if (bmi < 18.5) {
                status[i] = "Underweight" ;
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight" ;
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight" ;
            } else {
                status[i] = "Obese" ;
            }
        }
        return status ;
    }

	public static void main(String args  []) {
		Scanner input = new Scanner(System.in) ;
		
		//creating an 2D array data, getting user input, calculating BMI and displaying result 
		double[][] data = new double[10][3] ;
        for (int i = 0 ; i < 10 ; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ") ;
            data[i][0] = input.nextDouble() ;
            System.out.print("Enter height (cm) of member " + (i + 1) + ": ") ;
            data[i][1] = input.nextDouble() ;
        }

        calculateBMI(data) ;
        String[] status = checkStatus(data) ;
        System.out.println("  BMI Report  ") ;
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Member " + (i + 1) +" 's Weight is " + data[i][0] + " kg" +", Height is " + data[i][1] +
			" cm" +", BMI is " + data[i][2] +", Status: " + status[i]) ;
        }

        input.close()  ;
    }
}

import java.util.* ;
public class BMICalculator {

   //creating methods computeBMI, computeAllBMI and displayResults to calculate BMI for individuals, BMI for all and display result
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0 ; 
        double bmi = weight / (heightM * heightM) ;

        bmi = Math.round(bmi * 100.0) / 100.0 ;

        String status ;
        if (bmi < 18.4) {
            status = "Underweight" ;
        } else if (bmi < 25) {
            status = "Normal" ;
        } else if (bmi < 39.9) {
            status = "Overweight" ;
        } else {
            status = "Obese" ;
        }

        return new String[]{String.valueOf(weight), String.valueOf(heightCm), String.valueOf(bmi), status} ;
    }
	public static String[][] computeAllBMI(double[][] data) {
        String[][] result = new String[data.length][4] ;

        for (int i = 0 ; i < data.length ; i++) {
            result[i] = computeBMI(data[i][0], data[i][1]) ;
        }
        return result ;
    }
	
    public static void displayResults(String[][] arr) {
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus") ;
        System.out.println("-------------------------------------------------------------") ;
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println((i+1) + "\t" + arr[i][0] + "\t\t" + arr[i][1] + "\t\t" +
                arr[i][2] + "\t\t" + arr[i][3]) ;
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        double[][] data = new double[10][2] ; 
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:") ;
        for (int i = 0 ; i < 10 ; i++) {
            System.out.print("Person " + (i+1) + " - Weight (kg): ") ;
            data[i][0] = sc.nextDouble() ;
            System.out.print("Person " + (i+1) + " - Height (cm): ") ;
            data[i][1] = sc.nextDouble() ;
        }

        String[][] results = computeAllBMI(data) ;
        displayResults(results) ;

        sc.close() ;
    }
}
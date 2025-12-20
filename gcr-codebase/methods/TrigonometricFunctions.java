
import java.util.* ;
public class TrigonometricFunctions {

	//creating a method calculateTrigonometricFunctions to calculate various trigonometric functions
	public double[] calculateTrigonometricFunctions(double angle)
	{
	 double [] arr = new double[3] ;
	 double radians = Math.toRadians(angle);
	 arr[0] = Math.sin(radians);
     arr[1] = Math.cos(radians);
     arr[2] = Math.tan(radians);
	 return arr ;

	}
	public static void main (String args []) {
		//creating variable angle and taking user input and computing trigonometric functions
		Scanner input = new Scanner (System.in) ;
		System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
        double[] result = trigonometricFunctions.calculateTrigonometricFunctions(angle);
		System.out.println("Sin(" + angle + "°) = " + result[0]);
		System.out.println("Cos(" + angle + "°) = " + result[1]);
		System.out.println("Tan(" + angle + "°) = " + result[2]);


	}
}
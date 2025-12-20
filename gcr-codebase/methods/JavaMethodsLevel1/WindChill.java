
import java.util.* ;
public class WindChill {

	//creating a method calculateWindChill to calculate the wind chill temperature
	public double calculateWindChill(double temperature, double windSpeed) {
	 
	 double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow( windSpeed, 0.16 ) ; 
	 return windChill ;
	}
	public static void main (String args []) {
		//creating variables temp and speed and taking user input
		Scanner input = new Scanner (System.in) ;
		System.out.println ("Enter the temperature : ") ;
		double temp = input.nextInt() ;
		System.out.println ("Enter the wind speed : ") ;
		double speed = input.nextInt() ;
	
		WindChill windChill = new WindChill() ;
		double result = windChill.calculateWindChill(temp, speed) ;
		System.out.println("The wind chill for " +temp +" and " +speed +" is " +result) ;

	}
}
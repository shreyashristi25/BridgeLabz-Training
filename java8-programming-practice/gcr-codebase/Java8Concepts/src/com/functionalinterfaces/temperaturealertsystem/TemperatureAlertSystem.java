package com.functionalinterfaces.temperaturealertsystem;
import java.util.* ;
import java.util.function.* ;

public class TemperatureAlertSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking threshold temperature and temperatures as user input 
		System.out.println("Enter threshold temperature : ") ;
		double threshold = sc.nextDouble();
		
		//creating Predicate object
		Predicate <Double> isAboveThreshold = temp -> temp >threshold ;

		System.out.println("Enter number of temperature readings : ") ;
		int n = sc.nextInt();
		sc.nextLine();
		
		//using Predicate functional interface and displaying result
		for(int i =0; i <n; i++) {
			
			System.out.println("Enter temperature readings : ") ;
			double temp = sc.nextDouble();
			
			if(isAboveThreshold.test(temp)) {
				System.out.println("ALERT!! Temperature above threshold.") ;
			}
			else {
				System.out.println("OK...Temperature is within safe zone.") ;
			}
		}
	}

}

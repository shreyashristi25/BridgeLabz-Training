/*Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.*/

import java.util.* ;
public class TemperatureLogger {
	public static void main (String args []) {
		
		//creating a temp array consisting of the temperatures of the seven days of a week and string array to store name od days
		double [] temp = {12.0, 30.2, 35.5, 23.2, 32.0, 18.6, 40.8} ;
		String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday", "Sunday"} ;
		double sum = 0;
	    
		//checking if the temperature was too hot, too low or moderate
		System.out.println("----------Temperature Log of The Week----------") ;
		System.out.println() ;
		
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];

		if (days[i].length() >= 8) {   
			System.out.print(days[i] + "\t");
		}
		else {
			System.out.print(days[i] + "\t\t");
		}

		System.out.print(temp[i] + "\t\t");

		if (temp[i] > 35) {
			System.out.println("Too High!");
		}
		else if (temp[i] > 15) {
			System.out.println("Moderate! :)");
		}
		else {
			System.out.println("Too Low!");
		}
	}

		
		System.out.println() ;
		
		double avgTemp = sum / 7 ;
		Arrays.sort(temp) ;
		double maxTemp = temp[6] ;
		
		//checking if the week was too hot, too low or moderate and displaying result 
		if(avgTemp > 32) {
			System.out.println("The week was too hot!") ;
		}
		else if (avgTemp >15) {
			System.out.println("The week was moderate!") ;
		}
		else {
			System.out.println("The week was too cold!") ;
		}
		
		System.out.println();
		System.out.println("The average temperature of this week :" +avgTemp) ;
		System.out.println("The maximum temperature in this week :" +maxTemp) ;
		
	}
}
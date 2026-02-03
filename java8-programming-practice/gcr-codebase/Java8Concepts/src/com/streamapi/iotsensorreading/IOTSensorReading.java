package com.streamapi.iotsensorreading;
import java.util.* ;

public class IOTSensorReading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of readings, threshold and readings from user 
		List<Double> readings = new ArrayList<>() ;
		System.out.println("Enter number of readings : ");
		int n = sc.nextInt() ;
		sc.nextLine();
		
		System.out.println("Enter threshold : ") ;
		double threshold = sc.nextDouble() ;
		sc.nextLine();
		
		System.out.println("Enter readings : ") ;
		for(int i =0; i < n;i++) {
			double reading = sc.nextDouble() ;
			
			readings.add(reading) ;
		}
		
		//filtering and displaying readings above threshold
		System.out.println("Readings above threshold are : ") ;
		readings.stream().filter(x-> x > threshold) .forEach(System.out :: println);

	}

}

package com.sensordataordering;
import java.util.* ;

public class CropMonitor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of crops and time stamps
		System.out.println("Enter the number of time stamps : ") ;
		int n = sc.nextInt();
		
		System.out.println("Enter the crops time stamps : ") ;
		int [] timeStamps = new int[n];
		
		for(int i = 0 ; i < n;i ++) {
			timeStamps[i] = sc.nextInt();
		}
		//creating Crop object and displaying result
		Crop crop = new Crop() ;
		crop.quickSort(timeStamps, 0, n-1);
		System.out.println("Sorted Sensor time stamps : ") ;
		for(int t : timeStamps) {
			int hours = t / 100;
            int minutes = t % 100;
            System.out.printf("%02d:%02d\n", hours, minutes);

		}

	}

}

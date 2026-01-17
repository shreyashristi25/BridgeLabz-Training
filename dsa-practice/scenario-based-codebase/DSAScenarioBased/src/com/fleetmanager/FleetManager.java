package com.fleetmanager;
import java.util.* ;

public class FleetManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of vehicles and their mileages
		System.out.println("Enter the number of vehicles  : ") ;
		int n = sc.nextInt();
		
		System.out.println("Enter the mileage of vehicles : ") ;
		int [] mileage = new int[n] ;
		
		for(int i = 0; i < n ; i++) {
			mileage [i] = sc.nextInt();
		}
		
		//creating object, calling methods and displaying vehicles with their sorted mileage 
		VehicleMaintenanceScheduler schedule = new VehicleMaintenanceScheduler () ;
		schedule.mergeSort(mileage, 0, n-1) ;
		
		System.out.println("Master Maintenance Schedule(Sorted by mileage)") ;
		for(int m : mileage) {
			System.out.println("Vehicle with mileage : " +m ) ;
		}

	}

}

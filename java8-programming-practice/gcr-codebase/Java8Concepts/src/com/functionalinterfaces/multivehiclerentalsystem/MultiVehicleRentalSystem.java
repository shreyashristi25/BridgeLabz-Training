package com.functionalinterfaces.multivehiclerentalsystem;
import java.util.* ;

public class MultiVehicleRentalSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Car car = new Car() ;
		Bike bike = new Bike() ;
		Bus bus = new Bus() ;
		
		while(true) {
			System.out.println("1. Rent Car") ;
			System.out.println("2. Return Car") ;
			System.out.println("3. Rent Bike") ;
			System.out.println("4. Return Bike") ;
			System.out.println("5. Rent Bus") ;
			System.out.println("6. Return Bus") ;
			System.out.println("7. Exit") ;
			System.out.println("Enter your choice  : ") ;
			int choice = sc.nextInt(); 
			sc.nextLine();
		
			switch(choice) {
		
				case 1 :
					car.rent();
					break ;
				case 2  :
					car.returnVehicle() ;
					break ;
				case 3 :
					bike.rent();;
					break ;
				case 4 :
					bike.returnVehicle();
					break ;
				case 5 :
					bus.rent();
					break ;
				case 6 : 
					bus.returnVehicle(); 
					break ;
				case 7 : 
					System.out.println("Exiting..........") ;
					return ;
				default : 
					System.out.println("Invalid Choice!") ;
			}
		
		}
	}

}

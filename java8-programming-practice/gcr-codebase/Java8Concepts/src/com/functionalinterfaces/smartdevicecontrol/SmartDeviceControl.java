package com.functionalinterfaces.smartdevicecontrol;
import java.util.* ;

public class SmartDeviceControl {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		Light light = new Light() ;
		AC ac = new AC() ;
		TV tv = new TV() ;
		
		//taking user input and performing operations accordingly
		while(true) {
			System.out.println("1. TURN ON Lights") ;
			System.out.println("2. TURN OFF Lights") ;
			System.out.println("3. TURN ON AC") ;
			System.out.println("4. TURN OFF AC") ;
			System.out.println("5. TURN ON TV") ;
			System.out.println("6. TURN OFF TV") ;
			System.out.println("7. Exit") ;
			System.out.println("Enter your choice  : ") ;
			int choice = sc.nextInt(); 
			sc.nextLine();
		
			switch(choice) {
		
				case 1 :
					light.turnOn();
					break ;
				case 2  :
					light.turnOff() ;
					break ;
				case 3 :
					ac.turnOn();
					break ;
				case 4 :
					ac.turnOff(); 
					break ;
				case 5 :
					tv.turnOn();
					break ;
				case 6 : 
					tv.turnOff() ;
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

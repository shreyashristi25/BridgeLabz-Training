package com.traincomparision;
import java.util.* ;
public class TrainCompanion {

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in) ;
		
		//creating object of CompartmentNavigation class
		CompartmentNavigation compt = new  CompartmentNavigation() ;
		 
		
		//taking user choice, calling method and displaying result accordingly
		while(true) {
			System.out.println("1. Add new Compartment");
			System.out.println("2. Remove Compartment") ;
			System.out.println("3. Move Forward") ;
			System.out.println("4. Move Backward") ;
			System.out.println("5. Show adjacent Compartments of all compartments") ;
			System.out.println("6. Exit") ;
			System.out.println("Enter your choice : ") ;
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 :
				System.out.print("Enter the Compartment ID: ");
		        String id = sc.nextLine();

		        System.out.print("Enter the service of the Compartment: ");
		        String service = sc.nextLine();

		        compt.addCompartment(id, service);
		        break;
				
			case 2 :
				System.out.println("Enter compartment id to remove compartemnt : ") ;
				String removeId = sc.nextLine();
		
				compt.removeCompartment(removeId);
				break ;
				
			case 3 :
				compt.traverseForward();
				break ;
				
			case 4 :
				compt.traverseBackward();
				break ;
				
			case 5 :
				System.out.println();
				System.out.println("Enter the compartment ID : ") ;
				String adjID = sc.nextLine() ;
			    
				compt.showAdjacentCompartments(adjID) ;
				System.out.println();
				break ;
			
			case 6 :
				System.out.println("Exiting TrainComparision.....") ;
				return ;
				
			default :
				System.out.println("Invalid Choice! Please choose from above options.") ;
			}
		} 
		
		
	}
}

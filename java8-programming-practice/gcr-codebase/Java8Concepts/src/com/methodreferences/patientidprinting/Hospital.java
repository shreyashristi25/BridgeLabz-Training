package com.methodreferences;
import java.util.* ;

public class Hospital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		List<Patient> patients = new ArrayList<>() ;
		
		//taking number of patients and patient ids as user input
		System.out.println("Enter the number of patients in the hospital : ") ;
		int n = sc.nextInt();
		sc.nextLine() ;
		
		for( int i = 0; i < n ; i++) {
			System.out.println("Enter Patient Id " + (i+ 1) +" : ") ;
			String id = sc.nextLine() ;
			patients.add(new Patient(id)) ;	
		}
		
		System.out.println("Patient IDs for Admin Verification : ") ;
		
		//printing all patient ids 
		patients.forEach(System.out :: println);
		
		sc.close() ;
		
		

	}

}

package com.hospitalqueue;
import java.util.* ;

public class HospitalQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of patient, their name and criticality
		List<Patient> patient = new ArrayList<> () ;
		System.out.println("Enter the number of patients : ") ;
		int n = sc.nextInt();
		
		for(int i = 0; i < n ;i++) {
			System.out.println("Enter the name of patients : ") ;
			String name = sc.nextLine(); 
			sc.nextLine() ;
			
			System.out.println("Enter the criticality of the patient : ") ;
			int critical = sc.nextInt();
	
			patient.add(new Patient(name, critical)) ;
		}	
		
		System.out.println("--- Arrival Order ---");
        for (Patient p : patient) {
            System.out.println(p);
        }

        //calling bubbleSort method to sort the patient by their criticality and displaying result
        PatientSortingByCriticality.bubbleSort(patient);

        System.out.println("--- Sorted by Criticality ---");
        for (Patient p : patient) {
            System.out.println(p);
        }

        sc.close();


	}

}

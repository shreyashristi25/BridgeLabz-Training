package com.collections.queue.hospitaltriage;
import java.util.* ;

public class HospitalTriage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//priority with comparator 
		PriorityQueue<Patient> triage = new PriorityQueue<>(new Comparator<Patient> () { ;
		@Override
		public int compare(Patient p1, Patient p2) {
			return Integer.compare(p2.severity, p1.severity) ;
			}

		});
		
		//taking user input for number of patient, their name and severity
		System.out.println("Enter number of patients : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
	
		for( int i = 0; i < n; i++) {
			System.out.println("Enter the name of the patient : ") ;
			String name = sc.nextLine() ;
		
			System.out.println("Enter severity of patient : ") ;
			int severity = sc.nextInt() ;
			sc.nextLine() ;
		
			triage.add(new Patient(name, severity)) ;
		}
	
		//displaying treatment order according to their severity
		System.out.println("Treatement order of patients : " ) ;
		while(!triage.isEmpty()) {
			System.out.println(triage.poll()) ;
		}
	}

}

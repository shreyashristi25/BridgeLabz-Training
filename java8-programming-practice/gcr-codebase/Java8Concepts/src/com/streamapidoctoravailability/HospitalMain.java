package com.streamapidoctoravailability;
import java.util.* ;
import java.util.stream.Collectors;

public class HospitalMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of doctors, their name, specialty and availability as user input 
		List<Doctor> doctors = new ArrayList<>() ;
		System.out.println("Enter number of doctors : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for(int i =0; i < n; i++) {
			System.out.println("Enter the name of the doctor : ") ;
			String name = sc.nextLine() ;
			
			System.out.println("Enter specialty : ") ;
			String specialty = sc.nextLine() ;
			
			System.out.println("Available on Weekends(true/false ) : ") ;
			boolean availability = sc.nextBoolean() ;
			sc.nextLine();
			
			doctors.add(new Doctor(name, specialty, availability)) ;
			
		}
		
		//using streams to filter doctors based on their availability and sort them on the basis if their specialty
		List<Doctor> weekendAvaialableDoctors = doctors.stream()
				.filter(Doctor :: getAvaialability)
				.sorted(Comparator.comparing (Doctor :: getSpecialty))
				.collect(Collectors.toList()) ;

		//displaying doctors who are available on weekends
		System.out.println("Doctors avaialable on weekends are :") ;
		System.out.println(weekendAvaialableDoctors) ;
	}

}

package com.hospitalpatientmanagementsystem;

public class HospitalManagement {

	public static void main(String[] args) {

		Patient p1 = new InPatient(112 , "Charlie", 40, 10) ;
		Patient p2 = new OutPatient(113, "Sophie", 30, "2026-01-04") ;
		
		Doctor d1 = new Doctor(201, "Dr. Smith", "Cardiology");

        Bill b1 = new Bill(101, 5000, 0.1, 0.05);

        // Polymorphism in action
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();
        b1.displayInfo();

	}

}

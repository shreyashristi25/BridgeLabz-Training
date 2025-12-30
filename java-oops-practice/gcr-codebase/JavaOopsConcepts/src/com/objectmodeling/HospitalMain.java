package com.objectmodeling;

public class HospitalMain {
	
	public static void main(String[] args) {
        // Create hospital, doctors and patients
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Shruti", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Arjun", "Neurologist");

        Patient p1 = new Patient("Meera");
        Patient p2 = new Patient("Ravi");

        // Add doctors and patients to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations 
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        // Display hospital structure and consultations
        hospital.displayHospital();

        d1.viewPatients();
        d2.viewPatients();
        p1.viewDoctors();
        p2.viewDoctors();
    }

}

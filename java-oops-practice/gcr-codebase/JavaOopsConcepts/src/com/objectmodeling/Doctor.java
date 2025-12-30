package com.objectmodeling;
import java.util.ArrayList;

public class Doctor {
	
	private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // method to Consult a patient 
    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " (" + specialization + 
                           ") is consulting patient " + patient.getName());
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); 
        }
    }

    //method to  View patients consulted
    public void viewPatients() {
        System.out.println("Doctor: " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

}

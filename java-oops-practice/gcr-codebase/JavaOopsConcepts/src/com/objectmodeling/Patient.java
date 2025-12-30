package com.objectmodeling;
import java.util.ArrayList;

public class Patient {

	private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // methods to add doctor to patient’s list and view doctors consulted
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void viewDoctors() {
        System.out.println("Patient: " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

}

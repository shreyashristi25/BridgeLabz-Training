package com.encapsulation;

public abstract class Patient {

	private String patientId;
    private String name;
    private int age;

    //constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // getter methods to get patient id, name, age and details
    public String getPatientId() {
        return " " + patientId.substring(patientId.length() - 4);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientDetails() {
        return "Patient ID: " + getPatientId() + ", Name: " + name + ", Age: " + age;
    }

    // Abstract method
    public abstract double calculateBill();

}

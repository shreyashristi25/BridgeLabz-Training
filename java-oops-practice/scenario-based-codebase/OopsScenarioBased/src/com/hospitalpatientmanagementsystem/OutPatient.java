package com.hospitalpatientmanagementsystem;

public class OutPatient extends Patient{

	private String appointmentDate;

    public OutPatient(int id, String name, int age, String appointmentDate) {
        super(id, name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient Appointment: " + appointmentDate + " | " + getSummary());
    }

}

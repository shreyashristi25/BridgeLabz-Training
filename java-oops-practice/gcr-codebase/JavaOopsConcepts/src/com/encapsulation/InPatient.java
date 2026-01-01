package com.encapsulation;

//creating InPatient as a subclass of Patient and MedicalRecord
public class InPatient extends Patient implements MedicalRecord {

	private double roomCharge;
    private double treatmentCharge;
    private String diagnosis;
    private String medicalHistory;

    //constructor
    public InPatient(String patientId, String name, int age, double roomCharge, double treatmentCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.treatmentCharge = treatmentCharge;
        this.diagnosis = "";
        this.medicalHistory = "";
    }

    //overriden methods of Patient class
    @Override
    public double calculateBill() {
        return roomCharge + treatmentCharge;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory += record + "; ";
    }

    @Override
    public String viewRecords() {
        return "Diagnosis: " + diagnosis + ", History: " + medicalHistory;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}

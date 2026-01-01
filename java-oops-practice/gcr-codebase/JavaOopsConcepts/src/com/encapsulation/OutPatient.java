package com.encapsulation;

//creating outPatient as a subclass of Patient and MedicalRecord
public class OutPatient extends Patient implements MedicalRecord{

	private double consultationFee;
    private String diagnosis;
    private String medicalHistory;

    //constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.diagnosis = "";
        this.medicalHistory = "";
    }

    //overriden methods of Patient class
    @Override
    public double calculateBill() {
        return consultationFee;
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

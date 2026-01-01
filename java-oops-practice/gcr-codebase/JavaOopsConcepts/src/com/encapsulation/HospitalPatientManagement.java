package com.encapsulation;

//driver class for all other classes of Hospital Patient Management system
public class HospitalPatientManagement {

	public static void main(String[] args) {

		 // Array of patients 
        Patient[] patients = new Patient[2];
        patients[0] = new InPatient("P101", "Alice", 30, 5000, 8000);
        patients[1] = new OutPatient("P202", "Bob", 45, 1000);

        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Bill: " + p.calculateBill());

            MedicalRecord record = (MedicalRecord) p;
            record.addRecord("Routine checkup");
            System.out.println(record.viewRecords());
            System.out.println("-----------------------------------");
        }


	}

}

package com.hospitalqueue;
import java.util.* ;

public class PatientSortingByCriticality {

	//method for sorting patients by criticality
	public static void bubbleSort(List<Patient> patient) {
		int n = patient.size();
		
		//applying bubble sort logic
		for(int i = 0; i < n - 1;i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if (patient.get(j).critical < patient.get(j + 1).critical) {
                   
                    Patient temp = patient.get(j);
                    patient.set(j, patient.get(j + 1));
                    patient.set(j + 1, temp);
                }

			}
		}
		
	}
}

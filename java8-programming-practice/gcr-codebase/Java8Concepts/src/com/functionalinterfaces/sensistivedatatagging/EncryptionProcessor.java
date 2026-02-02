package com.functionalinterfaces.sensistivedatatagging;

public class EncryptionProcessor {

	//method to process data 
	public static void process(Object obj) {
		if(obj instanceof SensitiveData) {
			System.out.println("Encrypting sensitive data : " +obj) ;
		}
		else {
			System.out.println("No encryption needed : " +obj) ;
		}
	}
}

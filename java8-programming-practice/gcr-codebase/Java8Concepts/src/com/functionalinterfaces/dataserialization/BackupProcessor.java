package com.functionalinterfaces.dataserialization;

public class BackupProcessor {

	//method to process backup
	public static void processBackup(Object obj) {
		if(obj instanceof BackupSerialization) {
			System.out.println("Backing up: " + obj);

		}
		else {
            System.out.println("Cannot backup: " + obj + " (Not marked as BackupSerializable)");
        }

	}
}

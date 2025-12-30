package com.objectmodeling;

public class UniversityMain {

	public static void main(String[] args) {
		
		// Create university and add departments
        University uni = new University("Oxford University");

        UniversityDepartment csDept = uni.addDepartment("Computer Science");
        UniversityDepartment mathDept = uni.addDepartment("Mathematics");

        // Add faculty members consistently
        csDept.addFaculty("Shruti", "Professor of AI");
        csDept.addFaculty("Arjun", "Senior Lecturer");
        mathDept.addFaculty("Meera", "Head of Department");

        // creating method to display university details, delete and display it again
        uni.displayUniversity();

        uni.deleteUniversity();

        // Display again (departments cleared)
        uni.displayUniversity(); 

	}

}

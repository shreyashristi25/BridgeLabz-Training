package com.constructor.level1;

public class StudentMain {
	
	public static void main(String[] args) {
        Student s1 = new Student(101, "Shreya", 8.7);
        s1.displayStudentDetails();

        // Modifying CGPA using setter
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Amit", 8.5, "Computer Science");
        pg1.displayPostgraduateDetails();
    }

}

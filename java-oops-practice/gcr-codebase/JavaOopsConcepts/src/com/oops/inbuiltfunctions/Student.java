package com.oops.inbuiltfunctions;

public class Student {

	  // Static and instance variables
	   private static String universityName;
	   private static int totalStudents = 0;
	   
	   private final int rollNumber; 
	   private String name;
	   private char grade;
	   
	   public Student(String name, int rollNumber, char grade) {
	       this.name = name;
	       this.rollNumber = rollNumber;
	       this.grade = grade;
	       totalStudents++;
	   }
	   // Static method to set the university name and Static method to display the total number of students enrolled
	   public static void setUniversityName(String name) {
	       universityName = name;
	   }
	   
	   public static void displayTotalStudents() {
	       System.out.println("Total Students Enrolled: " + totalStudents);
	   }
	   // Method to display student details
	   public void displayStudentDetails() {
	       
	       if (this instanceof Student) {
	           System.out.println("University Name: " + universityName);
	           System.out.println("Roll Number: " + rollNumber);
	           System.out.println("Name: " + name);
	           System.out.println("Grade: " + grade);
	       } else {
	           System.out.println("The object is not an instance of the Student class.");
	       }
	   }
	   // Method to update the student's grade
	   public void updateGrade(char newGrade) {
	      
	       if (this instanceof Student) {
	           this.grade = newGrade;
	           System.out.println("Grade updated to: " + newGrade);
	       } else {
	           System.out.println("The object is not an instance of the Student class.");
	       }
	   }
	   // Getters for instance variables (optional, but recommended for encapsulation)
	   public String getName() {
	       return name;
	   }
	   public int getRollNumber() {
	       return rollNumber;
	   }
	   public char getGrade() {
	       return grade;
	   }
	   public static void main(String[] args) {
	       // Set the university name, create new student instances and display the result
	       Student.setUniversityName("Global University");
	       
	       Student student1 = new Student("Hemashree", 101, 'A');
	       Student student2 = new Student("Sharmila", 102, 'B');
	       
	       Student.displayTotalStudents();
	       
	       student1.displayStudentDetails();
	       System.out.println();
	       student2.displayStudentDetails();
	       
	       student2.updateGrade('A');
	       System.out.println();
	       
	       student2.displayStudentDetails();
	   }

}

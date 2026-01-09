package com.skillforge;
import java.util.* ;

public class SkillForge {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // taking user input for Instructor info
	        System.out.print("Enter Instructor Name: ");
	        String iname = sc.nextLine();
	        
	        System.out.print("Enter Instructor Email: ");
	        String iemail = sc.nextLine();
	        
	        Instructor prof = new Instructor(iname, iemail);

	        // taking user input for Course info
	        System.out.print("Enter Course Title: ");
	        String ctitle = sc.nextLine();
	        
	        Course course = new Course(ctitle, prof);

	        // taking user input for Student info
	        System.out.print("Enter Student Name: ");
	        String sname = sc.nextLine();
	        
	        System.out.print("Enter Student Email: ");
	        String semail = sc.nextLine();
	        
	        Student student = new Student(sname, semail);

	        // updating progress 
	        System.out.print("Enter progress percent to add: ");
	        double p = sc.nextDouble();
	        student.addProgress(p);

	        // taking Review input and generating certificates
	        sc.nextLine(); 
	        System.out.print("Enter review: ");
	        String review = sc.nextLine();
	        
	        System.out.print("Enter stars (0-5): ");
	        double stars = sc.nextDouble();
	        
	        course.addReview(review, stars);

	        System.out.println(student.generateCertificate());
	        System.out.println(course.generateCertificate());

	        sc.close();
	 }
}

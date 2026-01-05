package com.campusconnect;
import java.util.* ;

public class CampusConnect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;


		//Taking user input 
        System.out.println("Enter Student ID:");
        int sid = sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("Enter Student Name:");
        String sname = sc.nextLine();
        
        System.out.println("Enter Student Email:");
        String semail = sc.nextLine();

        Student s1 = new Student(sid, sname, semail);

        // Adding grades
        System.out.println("Enter number of grades to add:");
        int gcount = sc.nextInt();
        
        for (int i = 0; i < gcount; i++) {
            System.out.println("Enter grade " + (i + 1) + ":");
            int grade = sc.nextInt();
            s1.addGrade(grade);
        }

        // Create Faculty
        System.out.println("Enter Faculty ID:");
        int fid = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Faculty Name:");
        String fname = sc.nextLine();
        
        System.out.println("Enter Faculty Email:");
        String femail = sc.nextLine();

        Faculty f1 = new Faculty(fid, fname, femail);

        // Create Course
        System.out.println("Enter Course ID:");
        String cid = sc.nextLine();
        
        System.out.println("Enter Course Name:");
        String cname = sc.nextLine();

        Course c1 = new Course(cid, cname);

        // Enroll student and faculty
        s1.enrollCourse(c1);
        f1.enrollCourse(c1);

        // Print details
        System.out.println("===== Student Details =====");
        s1.printDetails();
        System.out.println("===== Faculty Details =====");
        f1.printDetails();

        sc.close();

    }
}

package com.universitycourseenrollmentsystem;
import java.util.* ;

//driver class for all other classes in University Management System
public class UniversityManagement {

	public static void main(String[] args) {

		//creating objects , accessing the methods and displaying result
		Course c1 = new Course(101, "Data Structures", 3);
        Course c2 = new Course(102, "Algorithms", 4);

        Student s1 = new Undergraduate(1, "Alia");
        Student s2 = new Postgraduate(2, "Bob", Arrays.asList(c1));

        Faculty f1 = new Faculty(201, "Dr. Smith", "Computer Science");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        f1.assignGrade(s1, c1, "A");
        f1.assignGrade(s1, c2, "B");

        s1.displayInfo();
        s2.displayInfo();

        Enrollment e1 = new Enrollment(s1, c1, "A");
        e1.displayInfo();


	}

}

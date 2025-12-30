package com.objectmodeling;

public class SchoolMain {

	public static void main(String[] args) {
        // Creating school and students
        School school = new School("Technocrats");

        Student shruti = new Student("shruti");
        Student arjun = new Student("Arjun");
        Student meera = new Student("Meera");

        // Adding students to school and creating courses
        school.addStudent(shruti);
        school.addStudent(arjun);
        school.addStudent(meera);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Enroll students in courses 
        math.enrollStudent(shruti);
        math.enrollStudent(arjun);

        science.enrollStudent(shruti);
        science.enrollStudent(meera);

        history.enrollStudent(arjun);

        // Display school students and courses of each student and course of each student
        school.displayStudents();
     
        shruti.viewCourses();
        arjun.viewCourses();
        meera.viewCourses();

        math.displayStudents();
        science.displayStudents();
        history.displayStudents();
    }


}

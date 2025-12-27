package com.constructor.level1;

public class CourseMain {

	public static void main(String[] args) {
        
        Course c1 = new Course("Operating System", 12, 5000.0);
        Course c2 = new Course("DBMS", 10, 4500.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }

}

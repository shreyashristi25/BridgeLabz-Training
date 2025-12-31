package com.inheritance.multiple;

public class CourseMain {

	public static void main(String[] args) {

		// Base course
        Course c1 = new Course("Mathematics Basics", 8);
        c1.displayInfo();
        System.out.println("-------------------");

        // Online course
        OnlineCourse c2 = new OnlineCourse("Java Programming", 12, "Coursera", true);
        c2.displayInfo();
        System.out.println("-------------------");

        // Paid online course
        PaidOnlineCourse c3 = new PaidOnlineCourse("Data Science Masterclass", 16,
                                                   "Udemy", true, 5000, 20);
        c3.displayInfo();


	}

}

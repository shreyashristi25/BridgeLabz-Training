package com.universitycourseenrollmentsystem;

//creating class faculty that implements Graded
public class Faculty implements Graded{

	private int id;
    private String name;
    private String department;

    //constructor
    public Faculty(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public void assignGrade(Student student, Course course, String grade) {
        double gradePoints = 0.0;
        if (grade.equals("A")) gradePoints = 4.0;
        else if (grade.equals("B")) gradePoints = 3.0;
        else if (grade.equals("C")) gradePoints = 2.0;
        else if (grade.equals("D")) gradePoints = 1.0;

        student.updateGPA(gradePoints, course.getCredits());
        System.out.println("Faculty " + name + " assigned grade " + grade + " to " + course.getTitle());
    }


    //method to display faculty's info
    public void displayInfo() {
        System.out.println("Faculty: " + name + " | Department: " + department);
    }

}

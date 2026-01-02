package com.universitycourseenrollmentsystem;
import java.util.* ;

public abstract class Student {

	private int id;
    private String name;
    private double gpa;
    private List<Course> courses;

    // Constructor without electives
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.gpa = 0.0;
        this.courses = new ArrayList<>();
    }

    // Constructor with electives
    public Student(int id, String name, List<Course> electives) {
        this.id = id;
        this.name = name;
        this.gpa = 0.0;
        this.courses = new ArrayList<>(electives);
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        System.out.println(name + " enrolled in " + course.getTitle());
    }

    public void updateGPA(double gradePoints, int credits) {
        // GPA calculation using operators
        gpa = ((gpa * totalCredits()) + (gradePoints * credits)) / (totalCredits() + credits);
    }

    private int totalCredits() {
        int sum = 0;
        for (Course c : courses) {
            sum += c.getCredits();
        }
        return sum;
    }

    public String getTranscript() {
        return "Student: " + name + " | GPA: " + gpa;
    }

    public abstract void displayInfo();

}

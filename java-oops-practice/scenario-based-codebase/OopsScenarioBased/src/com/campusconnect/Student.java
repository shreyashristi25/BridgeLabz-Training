package com.campusconnect;

//creating Student as a subclass of Person and ICourseActions
public class Student extends Person implements ICourseActions{

	private int [] grades;
    private int gradeCount;
    private Course [] enrolledCourses;
    private int courseCount;

    //constructor
    public Student(int id, String name, String email) {
        super(id, name, email);
        grades = new int[10];          
        enrolledCourses = new Course[5]; 
        gradeCount = 0;
        courseCount = 0;
    }

    //methods to add grade, calculate GPA and overriden methods from Person and IcourseActions 
    public void addGrade(int grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount++] = grade;
        }
    }

    public double calculateGPA() {
        if (gradeCount == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return (double) sum / gradeCount; 
    }
    
    @Override
    public void enrollCourse(Course c) {
        if (courseCount < enrolledCourses.length) {
            enrolledCourses[courseCount++] = c;
            c.addStudent(this);
        }
    }

    @Override
    public void dropCourse(Course c) {
        for (int i = 0; i < courseCount; i++) {
            if (enrolledCourses[i] == c) {
                
                for (int j = i; j < courseCount - 1; j++) {
                    enrolledCourses[j] = enrolledCourses[j + 1];
                }
                enrolledCourses[--courseCount] = null;
                c.removeStudent(this);
                break;
            }
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + " (ID: " + id + ")");
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(" - " + enrolledCourses[i].courseName);
        }
    }
}


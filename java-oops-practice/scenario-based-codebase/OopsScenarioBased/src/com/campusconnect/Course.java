package com.campusconnect;

public class Course {

	String courseId;
    String courseName;
    Faculty faculty;
    Student [] students;
    int studentCount;

    //constructor
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        students = new Student[50]; // max 50 students
        studentCount = 0;
    }

    //methods to add student, remove student, assign faculty and remove faculty
    public void addStudent(Student s) {
        if (studentCount < students.length) {
            students[studentCount++] = s;
        }
    }

    public void removeStudent(Student s) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == s) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                break;
            }
        }
    }
    public void assignFaculty(Faculty f) {
        this.faculty = f;
    }

    public void removeFaculty() {
        this.faculty = null;
    }
}

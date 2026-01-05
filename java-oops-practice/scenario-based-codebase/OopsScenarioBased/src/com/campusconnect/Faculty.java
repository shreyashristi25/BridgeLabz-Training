package com.campusconnect;

//creating Faculty as subclass of Person and ICourseActions 
public class Faculty extends Person implements ICourseActions{
	private Course [] teachingCourses;
    private int courseCount;

    //constructor
    public Faculty(int id, String name, String email) {
        super(id, name, email);
        teachingCourses = new Course[5];
        courseCount = 0;
    }

    //overriden methods of ICourseActions interface and Person class
    @Override
    public void enrollCourse(Course c) {
        if (courseCount < teachingCourses.length) {
            teachingCourses[courseCount++] = c;
            c.assignFaculty(this);
        }
    }

    @Override
    public void dropCourse(Course c) {
        for (int i = 0; i < courseCount; i++) {
            if (teachingCourses[i] == c) {
                // shift left
                for (int j = i; j < courseCount - 1; j++) {
                    teachingCourses[j] = teachingCourses[j + 1];
                }
                teachingCourses[--courseCount] = null;
                c.removeFaculty();
                break;
            }
        }
    }
    
    @Override
    public void printDetails() {
        System.out.println("Faculty: " + name + " (ID: " + id + ")");
        System.out.println("Email: " + email);
        System.out.println("Teaching Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(" - " + teachingCourses[i].courseName);
        }
    }
}

package com.objectmodeling;

public class UniversityManagementMain {

	public static void main(String[] args) {
		UniversityManagement uni = new UniversityManagement("Global University");

		//create student, professor, course and display result
        Students shruti = new Students("shruti");
        Students arjun = new Students("Arjun");

        Professor profMeera = new Professor("Meera");
        Professor profRavi = new Professor("Ravi");

        Courses math = new Courses("Mathematics");
        Courses cs = new Courses("Computer Science");

        uni.addStudent(shruti);
        uni.addStudent(arjun);
        uni.addProfessor(profMeera);
        uni.addProfessor(profRavi);
        uni.addCourse(math);
        uni.addCourse(cs);

        math.assignProfessor(profMeera);
        cs.assignProfessor(profRavi);

        math.enrollStudent(shruti);
        cs.enrollStudent(shruti);
        cs.enrollStudent(arjun);

        uni.displayUniversity();

        shruti.viewCourses();
        arjun.viewCourses();
        profMeera.viewCourses();
        profRavi.viewCourses();
        math.displayCourse();
        cs.displayCourse();

	}

}

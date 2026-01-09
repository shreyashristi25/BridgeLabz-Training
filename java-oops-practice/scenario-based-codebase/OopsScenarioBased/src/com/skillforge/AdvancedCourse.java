package com.skillforge;

//creating AdvancedCoureses as subclass of Course and implements ICertifiable
public class AdvancedCourse extends Course implements ICertifiable {

	//constructor
	public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public String generateCertificate() {
        return "Advanced Certificate: " + super.generateCertificate();
    }

}

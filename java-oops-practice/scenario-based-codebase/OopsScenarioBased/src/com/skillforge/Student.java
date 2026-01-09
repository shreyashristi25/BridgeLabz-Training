package com.skillforge;

//creating class Student as subclass of User and extends ICertifiable
public class Student extends User implements ICertifiable {

	private double progress;

	//constructor
    public Student(String name, String email) {
        super(name, email);
        this.progress = 0.0;
    }

    //method to add progress
    public void addProgress(double percent) {
        progress = Math.min(100.0, progress + percent);
    }

    @Override
    public String generateCertificate() {
        return "Certificate of Completion awarded to " + getName();

    }

}

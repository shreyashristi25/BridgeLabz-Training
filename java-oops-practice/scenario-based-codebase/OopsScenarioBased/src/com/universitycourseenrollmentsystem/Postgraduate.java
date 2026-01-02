package com.universitycourseenrollmentsystem;
import java.util.* ;

//creating Postgraduate as subclass of Student class
public class Postgraduate extends Student{

	//constructor without electives
	public Postgraduate(int id, String name) {
        super(id, name);
    }

	//constructor with electives
    public Postgraduate(int id, String name, List<Course> electives) {
        super(id, name, electives);
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate Student: " + getTranscript());
    }

}

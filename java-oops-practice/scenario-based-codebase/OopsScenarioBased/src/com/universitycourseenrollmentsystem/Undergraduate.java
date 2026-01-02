package com.universitycourseenrollmentsystem;
import java.util.* ;

//creating Undergraduate as subclass of Student class
public class Undergraduate extends Student{

	//constructor without electives
	public Undergraduate(int id, String name) {
        super(id, name);
    }

	//constructor with electives
    public Undergraduate(int id, String name, List<Course> electives) {
        super(id, name, electives);
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate Student: " + getTranscript());
    }

}

package com.reflection;
import java.util.* ;
import java.lang.reflect.*;

public class Student {

	private String name ;
	private int age ;
	
	public Student(String name, int age) {
		this.name = name ;
		this.age = age ;
	}
	
	public void display() {
		System.out.println("Name : " +name +" | Age : " +age) ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the name of the student  : ") ;
		String name = sc.nextLine() ;
		
		System.out.println("Enter the age of the student  : ") ;
		int age = sc.nextInt() ;
		
		//Dynamically loading student class object and invoking its method without using new keyword
		try {
           
            Class<?> cls = Class.forName("com.reflection.Student");

            Constructor<?> constructor = cls.getConstructor(String.class, int.class);

            Object obj = constructor.newInstance(name, age);

            Student s = (Student) obj;
            s.display();

        } 
		catch (Exception e) {
            e.printStackTrace();
        }


	}

}

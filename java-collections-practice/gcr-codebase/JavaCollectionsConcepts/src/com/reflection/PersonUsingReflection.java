package com.reflection;
import java.lang.reflect.* ;
import java.util.* ;


public class PersonUsingReflection {

	private int age ;
	
	//constructor
	public PersonUsingReflection(int age) {
		this.age = age ;
	}
	
	//getter methods to get age
	public int getAge() {
		return age ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter initial age : ") ;
		int initialAge = sc.nextInt();
		
		PersonUsingReflection p = new PersonUsingReflection(initialAge) ;
		System.out.println("Original age (Using getter) : " + p.getAge()) ;
		
		// Using Reflection to access, modify, and retrieve the private field 'age' of the Person object
		try {
            Class<?> cls = p.getClass();

            Field ageField = cls.getDeclaredField("age");

            ageField.setAccessible(true);

            System.out.print("Enter new age to set using reflection: ");
            int newAge = sc.nextInt();

            ageField.set(p, newAge);

            int modifiedAge = (int) ageField.get(p);
            System.out.println("Modified age (via reflection): " + modifiedAge);

        } 
		catch (Exception e) {
            e.printStackTrace();
        }

	}

}

package com.studentmanagement;
import java.util.* ;

public class Student {

	private String name  ;
	private String id ;
	private String firstName ;
	private int age ;
	private String gender ;
	private String city ;
	private int rank ;
	private long contact ;
	public String department  ;
	private List<Long> contacts;
    
	
	//constructor
	public Student(String name, String id, String firstName, int age, String gender,
            String city, String department, int rank, long contact) {
		this.name = name;
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.department = department;
		this.rank = rank;
		this.contacts = new ArrayList<>();
		this.contacts.add(contact);
	}

	
	//getter methods to get name, id, first name, age, gender, city, rank and contact of a student 
	public Student(List<Long> contacts ) {
        this.contacts = contacts != null ? contacts : new ArrayList<>();
    }

    public List<Long> getContacts() {
        return contacts;
    }

	public String getName () {
		return name  ;
	}
	
	public String getId () {
		return id  ;
	}
	
	public String getFirstName () {
		return firstName  ;
	}
	
	public int getAge () {
		return age  ;
	}
	
	public String getGender () {
		return gender   ;
	}
	
	public int getRank () {
		return rank  ;
	}
	
	public String getCity () {
		return city  ;
	}
	
	public long getContact () {
		return contact  ;
	}
	
	public String getDepartment () {
		return department  ;
	}
	
	@Override
	public String toString() {
		return "Student{" +
		           "id='" + id + '\'' +
		           ", name='" + name + '\'' +
		           ", first name =" + firstName +
		           ", age=" + age +
		           ", gender='" + gender + '\'' +
		           ", rank='" + rank + '\'' +
		           ", city='" + city + '\'' +
		           ", contact=" + contact +
		           '}';
	}
	
	
}

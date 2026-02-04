package com.employee;

public class Employee {

	private String id ;
	private String name ;
	private int age ;
	private String gender ;
	private String department ;
	private String yearOfJoining ;
	private double salary ;
	
	//constructor
	public Employee(String id, String name, int age, String gender, String department, String yearOfJoining, double salary) {
		this.id = id  ;
		this.name = name ;
		this.age = age ;
		this.gender = gender ;
		this.department = department ;
		this.yearOfJoining = yearOfJoining ;
		this.salary = salary ;
	}
	
	//getters to get id, name, age, gender, department, year of joining and salary of an employee
	public String getId() {
		return id ;
	}
	
	public String getName() {
		return name ;
	}
	
	public int getAge() {
		return age ;
	}
	
	public String getDepartment() {
		return department ;
	}
	
	public String getGender() {
		return gender ;
	}
	
	public String getYearOfJoining() {
		return yearOfJoining;
	}
	
	public double getSalary() {
		return salary ;
	}
	
	@Override
	public String toString() {
	    return "Employee{" +
	           "id='" + id + '\'' +
	           ", name='" + name + '\'' +
	           ", age=" + age +
	           ", gender='" + gender + '\'' +
	           ", department='" + department + '\'' +
	           ", yearOfJoining='" + yearOfJoining + '\'' +
	           ", salary=" + salary +
	           '}';
	}

	
}

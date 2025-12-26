package com.classandobject.level1;

public class Employees {
	
	//non-static variables
	String name;
	int id;
	double salary;
	
	//Constructor
	Employees(String name, int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	//creating method to display Employees details
	public  void displayEmployees() {
		System.out.println("Employees Name: "+name);
		System.out.println("Employees id: "+id);
		System.out.println("Employees Salary: "+salary);
	}
	
	public static void main(String[] args) {
	Employees emp=new Employees("Rohan",1,500000);//calling constructor
	emp.displayEmployees();//calling the display method
	}

}


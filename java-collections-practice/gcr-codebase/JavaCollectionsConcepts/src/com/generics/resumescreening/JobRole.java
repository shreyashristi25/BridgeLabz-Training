package com.generics.resumescreening;

//creating JobRole as abstract class 
public abstract class JobRole {

	private String roleName ;

	//constructor and getter method to get role name
	public JobRole(String roleName) {
		this.roleName =  roleName ;
		
	}
	
	public String getRoleName() {
		return roleName ;
		
	}
	
	@Override
	public abstract String toString() ;
}

package com.resumeanalyzer;

public class ResumeData {

	//private variables to ensure limited access
	private String email ;
	private String phone ;
	private int keywords ;
	
	//constructor
	public ResumeData(String email, String phone, int keywords) {
		this.email = email ;
		this.phone = phone ;
		this.keywords = keywords; 
	}
	
	//getter methods to get email, phone number and keyword count
	public String getEmail () {
		return email ;
	}
	
	public String getPhone() {
		return phone ;
	}
	
	public int getKeywords() {
		return keywords ;
	}
	
	@Override
	public String toString() {
		return "Email : " +email +" | Phone : " +phone +" | Keyword count : " +keywords;
	}
}

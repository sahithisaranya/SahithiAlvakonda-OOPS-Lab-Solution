package com.greatlearninglab1.model;

//create a class to store employee details
public class Employee {
	private String firstName;
	private String lastName;
	
	//parameterized constructor to set firstname and last name values
	public Employee(String fn,String ln) {
		this.firstName=fn;
		this.lastName =ln;
	}
	
	//default constructor to set first name and last name as empty strings
	public Employee() {
		this.firstName ="";
		this.lastName ="";
	}
	
	//setter method to store the firstName value
	public void setFirstName(String fn){
		this.firstName=fn;
	}
	
	//getter method to access the firstName value
	public String getFirstName() {
		return this.firstName;
	}
	
	//setter method to store the lastName value
	public void setLastName(String ln) {
		this.lastName = ln;
	}
	
	//getter method to access the lastName value
	public String getLastName() {
		return this.lastName;
	}
}

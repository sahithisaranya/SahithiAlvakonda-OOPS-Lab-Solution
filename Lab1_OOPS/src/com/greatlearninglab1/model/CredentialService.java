package com.greatlearninglab1.model;

import java.util.Random;

public class CredentialService extends Employee{
	
	//declaration of member variables
	private String department;
	
	//company name is constant to this service, so final keyword
	private final String company="abc";
	private String password;
	private String emailAddress;
	
	//default constructor
	public CredentialService()
	{
		super();//call default constructor of super class
		department="";//set empty string for department
	}
	
	//parameterized constructor with first name, last name and department name as parameters
	public CredentialService(String fn,String ln,String dept) {
		super(fn,ln);//call parameterized constructor of super class
		this.department=dept;//set department value equal to dept
	}
	
	
	//method to create a random password
	public void generatePassword() {
		//create an object to Random class
		Random rnd=new Random();
		
		//create a random number in the range of 100-999 for first characters of password
		int rndNum=rnd.nextInt(100,999);
		
		//the next character of password generated is a random capital letter
		char rndCapLetter=(char)(rnd.nextInt(26)+'A');
		
		//the next character of password generated is a random lower case letter
		char rndSmallLetter=(char)(rnd.nextInt(26)+'a');
		
		//create a string to store the special characters
		String specialCharStr="@#$%^&*!*_=+/.?<>";
		
		//generate a random number to get the random index of the string
		//that stores the set of special characters
		int specialIndex=rnd.nextInt(specialCharStr.length());
		
		//based on above created random index, get the random special character which is next character of password
		char rndSpecialChar=specialCharStr.charAt(specialIndex);
		
		//append the so far created random values to the password string
		password=String.valueOf(rndNum)+String.valueOf(rndCapLetter)
		+String.valueOf(rndSpecialChar)+String.valueOf(rndSmallLetter);
		
		//so far 6 characters are generated for password
		//generate another random capital letter and append to password string
		rndCapLetter=(char)(rnd.nextInt(26)+'A');
		password+=String.valueOf(rndCapLetter);
		
		//generate the final character of password that is random capital letter again
		//and append it to password string
		rndCapLetter=(char)(rnd.nextInt(26)+'A');
		password+=String.valueOf(rndCapLetter);
	}
	
	//method to generate the email address
	public void generateEmailAddress() {
		//email address is generated as firstnamelastname@department.company.com
		emailAddress=getFirstName()+getLastName()+"@"+department+"."+company+".com";
	}
	
	//method to show the credentials
	public void showCredentials() {
		//print the generated email address and password to screen
		System.out.println("Dear "+getFirstName()+", your generated credentials are as follows: ");
		System.out.println("Email    --->"+emailAddress);
		System.out.println("Password --->"+password);
		
	}
}

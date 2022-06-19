package com.greatlearninglab1.main;
import java.util.Scanner;

import com.greatlearninglab1.model.CredentialService;

public class Driver {
	
	//method to read department from user
	String getDepartment(Scanner sc){
		String deptStr="";//create a string and set department as empty
		int userChoice;//integer to read department from user
		
		do{//start a do while loop to ensure the user selected correct department
			//display a menu of department list
			System.out.println("Please enter the department from the following: ");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			//read the user entered choice
			//and validate it to be integer
			do{
				if(!sc.hasNextInt()){//check if user entered something other than integers if so display the message to let user know that input is invalid
					System.out.println("Invalid input! Only numbers in the range 1-4 are to be entered!");
					sc.next();//read the invalid input anyway
					userChoice=0;//set choice to 0
				}
				else
					userChoice=sc.nextInt();//otherwise read the valid input
			}while(userChoice==0);//repeat the steps so that user enters valid input
			
			
			//switch case selects the department string as per user choice
			//if user enters a wrong choice, then print an invalid message and the
			//entire menu display and user choice reading repeats
			switch(userChoice) {
				case 1: 
					deptStr="tech";
					break;
				case 2: 
					deptStr="admin";
					break;
				case 3: 
					deptStr="hr";
					break;
				case 4: 
					deptStr="legal";
					break;
				default: 
					System.out.println("Invalid department. Select from menu again!");
					break;
			}

		}while(userChoice<1 || userChoice>5);

		return deptStr;//return the department string generated to caller
	}
	
	
	//method to read first name from user
	String getFirstName(Scanner sc) {
		
		//display a message to enter first name and read it
		System.out.println("Enter your first name: ");
		String fname=sc.nextLine();
		
		//return the first name entered by user to caller
		return fname;
	}
	
	
	//method to read last name from user
	String getLastName(Scanner sc) {
		
		//display a message to enter last name and read it
		System.out.println("Enter your last name: ");
		String lname=sc.nextLine();
		
		//return the last name entered by user to caller
		return lname;
	}
	

	public static void main(String[] args) {
		
		//create an object to Driver class
		Driver driverObj=new Driver();
		
		//Create an object to Scanner class to read input
		Scanner scObj=new Scanner(System.in);
		
		//call respective methods to read firstname, lastname and department
		String firstName=driverObj.getFirstName(scObj);
		String lastName=driverObj.getLastName(scObj);
		String department=driverObj.getDepartment(scObj);
		
		//create an object to CredentialService class passing the
		//firstname, lastname and department strings as arguments
		CredentialService newEmployee=new CredentialService(firstName,lastName,department);
		
		//call the method generatePassword to create a random password
		newEmployee.generatePassword();
		
		//call the method generateEmailAddress to create email address
		newEmployee.generateEmailAddress();
		
		//call the method showCredentials to show the generated credentials
		newEmployee.showCredentials();
		
		scObj.close();//close the Scanner object
	}
}

package com.greatlearning.app;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredService;

public class DriverClass {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee("Virat","Kholi");
		
		CredService cs=new CredService();
		String generateEmail="";
		char[] genPwd=null;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Pls choose your department");
		System.out.println("1. Tech");
		System.out.println("2. Legal");
		System.out.println("3. HR");
		System.out.println("4. Accounts");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastname().toLowerCase(),"tech");
		    genPwd=cs.generatePassword();
			 break;
		case 2:generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastname().toLowerCase(),"legal");
		 genPwd=cs.generatePassword();			  
		 break;
		case 3:generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastname().toLowerCase(),"hr");
		       genPwd=cs.generatePassword();
		      break;
		case 4:generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastname().toLowerCase(),"accounts");
		       genPwd=cs.generatePassword();
		      break;
	    default:
	    	System.out.println("Pls enter valid choice");
		}
		
               System.out.println("Email ID :"+generateEmail);
               System.out.println("Password :"+genPwd);
	}

}

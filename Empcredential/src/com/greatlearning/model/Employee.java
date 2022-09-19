package com.greatlearning.model;

public class Employee {
	
	
  private String firstName;
  private String lastname;
     
  public Employee() {
	  this.firstName="Hrishi";
	  this.lastname="Chavan";
	  
  }

public Employee(String firstName, String lastname) {
	this.firstName = firstName;
	this.lastname = lastname;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

}

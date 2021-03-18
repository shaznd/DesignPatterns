package com.another;

public class Employee {
	
	
	
	 int id;
	 String name;
	 String fname;
	 int grade;
	double salary;
	String company;
	
	
	Email email;
	
	
	
	
	public Employee(int id, String name, String fname) {
		super();
		this.id = id;
		this.name = name;
		this.fname = fname;
		
	}
	
	public void notifyEmployee(Email email) {
		email.sendMail();
	}
	

}

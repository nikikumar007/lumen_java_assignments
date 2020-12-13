package com.example.demo;

import java.io.Serializable;

public class Professor implements Serializable {
	

	private String firstName;
	private String department;
	private  String  qualification;
	
	
public Professor() {
	}

public Professor(String firstName, String department,  String qualification) {
		super();
		this.firstName = firstName;
		this.department = department;
		this.qualification = qualification;
	}

public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}



public  String getQualification() {
	return qualification;
}

public void  setQualification(String qualification) {
	this.qualification = qualification;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.firstName+"," +this.department+"," +this.qualification;
}
}

package com.example.demo;

import com.example.ifaces.Conditional;

public class Professor implements Conditional {
	private String firstName;
	private String department;
	
	
	
public Professor() {
	}

public Professor(String firstName, String department, String qualification) {
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

private String qualification;

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

@Override
public boolean test(int value) {
	// TODO Auto-generated method stub
	return value==50;
}

@Override
public boolean check() {
	// TODO Auto-generated method stub
	return this.getQualification().equalsIgnoreCase("phd");
}

}

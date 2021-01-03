package com.example.demo;

public class Professor {
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

}

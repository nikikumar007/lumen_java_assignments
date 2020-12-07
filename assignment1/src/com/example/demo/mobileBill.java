package com.example.demo;

public class mobileBill {
private String name;
private long phoneNumber;
private String planName;
public static String telecomName="BSNL";
public mobileBill() {
}

public mobileBill(String name, long phoneNumber, String planName) {
	super();
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.planName = planName;
}
public mobileBill(String name, long phoneNumber) {
	super();
	this.name = name;
	this.phoneNumber = phoneNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getPlanName() {
	return planName;
}

public void setPlanName(String planName) {
	this.planName = planName;
}


}

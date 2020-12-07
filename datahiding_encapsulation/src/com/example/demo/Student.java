package com.example.demo;

public class Student {
	/*
	 * below are instance variables
	 * default values are 0.0,0,null,false
	 * can be used without assigning
	 */
private int rollNumber;
private String StudentName;
private double marksScored;
// default value of static variable is also there, here it is null
public static String trainerName;
public Student()
{
}

public Student(int rollNumber, String studentName) {
	super();
	this.rollNumber = rollNumber;
	StudentName = studentName;
}

public Student(int rollNumber, String studentName, double marksScored) {
	this.rollNumber = rollNumber;
	StudentName = studentName;
	this.marksScored = marksScored;
}


public int getRollNumber() {
	return rollNumber;
}

public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}

public String getStudentName() {
	return StudentName;
}

public void setStudentName(String studentName) {
	StudentName = studentName;
}

public double getMarksScored() {
	return marksScored;
}

public void setMarksScored(double marksScored) {
	this.marksScored = marksScored;
}

public String assignGrade()
{
	// cannot have any modifiers
	String grade="O";
	if(this.marksScored<80) {
		grade="A";
	}
	return grade;
}

}

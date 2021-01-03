package com.demo.example;

public class Student {

	private int rollNumber;
	private String StudentName;
	private double marksScored;

	public Student() {
	}

	public Student(int rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		StudentName = studentName;
	}

	public Student(int rollNumber, String studentName, double marksScored) {
		this.rollNumber = rollNumber;
		StudentName = studentName;
		try {
			if (marksScored < 0 || marksScored > 100) {
				throw new RangeCheckException("Marks should be between 0 to 100");
			} else {
				this.marksScored = marksScored;
			}
		} catch (RangeCheckException e) {
			e.getMessage();
			e.printStackTrace();

		}
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
		try {
			if (marksScored < 0 || marksScored > 100) {
				throw new RangeCheckException("Marks should be between 0 to 100");
			} else {
				this.marksScored = marksScored;
			}
		} catch (RangeCheckException e) {
			e.getMessage();
			e.printStackTrace();

		}

	}

}

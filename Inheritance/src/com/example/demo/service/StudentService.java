package com.example.demo.service;

import com.example.demo.Student;

public class StudentService {
   
	public void printStudentList(Student[] students)
	{
		for(Student eachStudent:students)
		{
			System.out.println(eachStudent);
		}
	}
	
	//feature of java5 which converts parameters into arrays
	public void displayStudentList(Student ... students)
	{
		for(Student eachStudent:students)
		{
			System.out.println(eachStudent);
			
		}
	}
	
}

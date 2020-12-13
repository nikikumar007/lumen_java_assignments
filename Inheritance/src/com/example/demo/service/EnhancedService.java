package com.example.demo.service;

import com.example.demo.Student;

public class EnhancedService extends StudentService {

	@Override
	public void printStudentList(Student[] students) {
		// TODO Auto-generated method stub
		for(Student eachStudent: students)
		{
		   print(eachStudent);
		}
	}

	@Override
	public void displayStudentList(Student... students) {
		// calling the overridden method which in turn calls print
		printStudentList(students);
	}
        private void print(Student eachStudent)
        {
        	System.out.println("Name: "+eachStudent.getName());
			System.out.println("Roll num: "+eachStudent.getRollnum());
			System.out.println("Mark scored: "+eachStudent.getMark());
        }
               
}


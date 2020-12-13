package com.example.apps;

import com.example.demo.Student;
import com.example.demo.service.EnhancedService;

public class Application {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student sam=new Student("Sam",87,101);
			Student ram=new Student("Ram",65,102);
			Student hari=new Student("Hari",90,103);
			
			Student[] list1= {sam,ram,hari};
			Student[] list2=new Student[3];
			list2[0]=sam;
			list2[1]=ram;
			list2[2]=hari;
			
	         EnhancedService ss=new EnhancedService();
			ss.printStudentList(list1);
			System.out.println("---------------------------------------");
			ss.printStudentList(list2);
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
			ss.displayStudentList(ram,sam);
			System.out.println("---------------------------------------");
			ss.displayStudentList(hari);
			
			
			

		}



	}


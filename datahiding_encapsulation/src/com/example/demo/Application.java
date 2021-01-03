package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram= new Student();
		System.out.println(ram.getMarksScored());
		System.out.println(ram.getRollNumber());
		System.out.println(ram.getStudentName());
		System.out.println(Student.trainerName);
		
		Student ramesh=new Student(101,"Ramesh",60);
		System.out.println(ramesh.getMarksScored());
		System.out.println(ramesh.getRollNumber());
		System.out.println(ramesh.getStudentName());
		System.out.println(ramesh.assignGrade());
		
		int r=Integer.parseInt(args[0]);
		double ms=Double.parseDouble(args[2]);
		
		Student rishi= new Student(r,args[1],ms);
		
		System.out.println(rishi.getMarksScored());
		System.out.println(rishi.getRollNumber());
		System.out.println(rishi.getStudentName());
		System.out.println(rishi.assignGrade());
	}

}

package com.example.demo;

import com.example.ifaces.Conditional;

public class Application {
	public static void print(Conditional poly)
	{
		System.out.println(poly.check());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Student ram= new Student(101,"Ramesh",67);
		boolean condition1=ram.test(ram.getRollNumber());
		System.out.println("Student test:" +condition1);
		
	FindEven obj = new FindEven();
	boolean condition2=obj.test(21);
	System.out.println("Interface test:" +condition2);
	print(ram);
	print(obj);
	
	}


}

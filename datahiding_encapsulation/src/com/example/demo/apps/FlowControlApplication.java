package com.example.demo.apps;

import java.util.Scanner;

import com.example.demo.Professor;
import com.example.demo.services.PaymentService;

public class FlowControlApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Professor prof=new Professor("nik","is","PG");
PaymentService service= new PaymentService();
double pgSalary=service.calculateSalary(prof);
System.out.println("Enter Qualification");
Scanner sc=new Scanner(System.in);
String qual=sc.next();
double phdSalary=service.calculateSalary(qual);
System.out.println(qual + phdSalary);
System.out.println("PG " +pgSalary);
sc.close();
	}

}

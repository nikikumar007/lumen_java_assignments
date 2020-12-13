package com.example.demo.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.demo.Patient;
import com.example.demo.services.DoctorService;

public class Application {

	public static void main(String [] args)
	{
		int k;
		Scanner sc=new Scanner(System.in);
		boolean start=true;
		DoctorService service=new DoctorService();
	 while(start)
	 {
		System.out.println("Enter 1: To add Doctor  Enter 2:Get Patients List Enter 3:To cancel Appointment Enter 4: To Exit ");
		int i=sc.nextInt();
		switch(i)
		{
		case 1: 
			System.out.println("Enter Doctor name");
			String docName=sc.next();
			System.out.println("Enter number of Patients");
			int number=sc.nextInt();
			List<Patient> list=new ArrayList<>(number);
			for(k=0;k<number;k++)
			{
				System.out.println("Enter Patient name");
				String name=sc.next();
				System.out.println("Enter Patient age");
				int age=sc.nextInt();
				Patient patient=new Patient(name, age);
				list.add(patient);
			}
			service.addDoctor(docName, list);
			break;
		case 2:
			System.out.println("Enter Doctor name");
			String name=sc.next();
			service.getPatients(name);
			break;
		case 3:
			System.out.println("Enter Doctor name");
			String doctorName=sc.next();
			System.out.println("Enter Patient name");
		    String patientName=sc.next();
		    service.checkDoctor(doctorName, patientName);
			break;
		case 4:
			start=false;
			break;
		}
	 }
	}
}

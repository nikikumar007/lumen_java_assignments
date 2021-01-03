package com.example.demo.services;
import static java.lang.Math.*;
import com.example.demo.Professor;

public class PaymentService {
	
	//protected double calculateSalary(Professor prof)
	public double calculateSalary(Professor prof)
	{
	double salary=5000.00;
	if(prof.getQualification().equals("PG"))
	{
		salary=60000;
	}
	else if(prof.getQualification().equalsIgnoreCase("phd"))
	{
		salary=75000;
	}
	return salary;
}
	
	public double calculateSalary(String qualification)
	{
		String key=qualification.toUpperCase();
		switch(key)
		{
		case "PG":
			return 60000;
		case "PHD":
			return 75000;
			default:
				return 50000;
		}
}
	public static void housingLoan()
	{
		System.out.println(sqrt(4));
	}
}

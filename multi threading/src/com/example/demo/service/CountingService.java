package com.example.demo.service;

public class CountingService {

	public void countNumbers(int countUpTo)
	{
	int sum=0;
	for(int i=0;i<=countUpTo;i++)
	{
		sum+=i;
	}
	System.out.println("Call by Thread: " +Thread.currentThread().getName()+"Sum of Numbers: " +countUpTo+": " +sum);
	}
	
}

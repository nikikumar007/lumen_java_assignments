package com.example.demo.service;

import java.util.concurrent.Callable;

public class SumNumber implements Callable<Integer> {
	private int countUpTo;
	
	public SumNumber(int countUpTo) {
		super();
		this.countUpTo = countUpTo;
	}

	@Override
	public Integer call() throws Exception {
	int sum=0;
	for(int i=0;i<=countUpTo;i++)
	{
		sum+=i;
	}
	System.out.println("Call by Thread: " +Thread.currentThread().getName());
	return sum;
	}
	

}

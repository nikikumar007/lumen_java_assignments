package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.demo.service.ExecutorPrintService;

public class UsingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ExecutorService executor= Executors.newSingleThreadExecutor();
ExecutorService executor= Executors.newFixedThreadPool(3);
ExecutorPrintService task1=new ExecutorPrintService("idly", "sambar");
ExecutorPrintService task2=new ExecutorPrintService("tea", "biscuit");
ExecutorPrintService task3=new ExecutorPrintService("pizza", "coke");
ExecutorPrintService task4=new ExecutorPrintService("dosa", "sambar");
executor.submit(task1);
executor.submit(task2);
executor.submit(task3);
executor.submit(task4);
	}

}

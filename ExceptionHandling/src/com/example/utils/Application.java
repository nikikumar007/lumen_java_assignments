package com.example.utils;

import java.io.IOException;

public class Application {
	static String name;
public static void main(String[] args)
{
	ExceptionHandling.usingTryCatch("66");
	
//	ExceptionHandling.usingTryCatchFinally(name);
//	int value=ExceptionHandling.usingTryCatchReturnFinally(name);
//	System.out.println(value);
//	try {
//		ExceptionHandling.usingThowAndThfrowsClause();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	ExceptionHandling.usingThow();
}
}

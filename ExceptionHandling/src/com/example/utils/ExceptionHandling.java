package com.example.utils;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ExceptionHandling {

	public static void usingTryCatch(String mark)
	{
		try {
			int marksScored=Integer.parseInt(mark);
			
			System.out.println(marksScored);
		} catch (NumberFormatException e) {
			System.err.println("enter number not string");
			System.err.println(e.getMessage());	
		}
	
				System.out.println("completed");
	}
	public static void usingTryCatchFinally(String name)
	{
		try {
			int length=name.length();
			System.out.println("length is:"+length);
		} catch (NullPointerException e) {
			System.err.println("name should not be null");
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finaaly block");
		}
		System.out.println("completed");
		
	}
	
//	public static int usingTryCatchReturnFinally(String name)
//	{
//		int length=0;
//		try {
//			 length=name.length();
//			System.out.println("length is:"+length);
//		} catch (NullPointerException e) {
//			System.err.println("name should not be null");
//			e.printStackTrace();
//			return 420;
//		}
//		
//		finally {
//			System.out.println("Inside finaaly block");
//		}
//		
//	System.out.println("completed ***");
//	return length;
//}
//	public static void usingThowAndThfrowsClause() throws IOException
//	{
//	int intChar=System.in.read();
//	System.out.println(intChar);
//	}
	
	public static void usingThow()
	{
		throw new RuntimeException("Hi");
	}
}
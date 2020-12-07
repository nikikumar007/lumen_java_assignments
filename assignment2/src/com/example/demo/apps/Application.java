package com.example.demo.apps;

import java.util.Scanner;

import com.example.demo.Book;
import com.example.demo.service.BookService;

public class Application {
	public static void main(String[] args)
	{
	Book b1=new Book(1,"Nights Tale","Nik",5000);
	System.out.println(b1.getPrice());
	BookService bs=new BookService();
	double dis=bs.calculateDiscount(b1);
System.out.println("Discount="+ dis);
	System.out.println("Total Price"+(b1.getPrice()-dis));
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Customer Type");
	String custType=sc.next();
	double dis1=bs.calculateDiscount(b1, custType);
	System.out.println("Discount="+dis1);
	}
}
	
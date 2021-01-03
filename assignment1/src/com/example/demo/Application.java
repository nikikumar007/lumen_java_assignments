package com.example.demo;

public class Application {
	public static void main(String[] args) {
		MobileBill bill1=new MobileBill("nik",9916040363l,"30 days");
		System.out.println(bill1.getName());
		System.out.println(bill1.getPhoneNumber());
		System.out.println(bill1.getPlanName());
		System.out.println(MobileBill.telecomName);
		MobileBill bill2= new MobileBill("sam",9916040364l,"90days");
		System.out.println(bill2.getName());
		System.out.println(bill2.getPhoneNumber());
		System.out.println(bill2.getPlanName());
		System.out.println(MobileBill.telecomName);
	}
}

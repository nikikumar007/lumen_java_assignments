package com.example.demo.apps;

import com.example.demo.CivilEngineer;
import com.example.demo.SoftwareEngineer;
import com.example.demo.ifaces.Billable;

public class Service {

	public static void print(Billable bill) {
		System.out.println(bill.calculate());
	}

	public static void main(String[] args) {
		SoftwareEngineer softengg = new SoftwareEngineer(1);
		CivilEngineer civilengg = new CivilEngineer("designer");
		print(civilengg);
		print(softengg);
	}
}

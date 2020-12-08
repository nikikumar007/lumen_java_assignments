package com.example.demo;

import com.example.demo.ifaces.Billable;

public class SoftwareEngineer implements Billable {
	private String position;

	public SoftwareEngineer(String position) {
		super();
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public double calculate() {
		double salary = 0;
		// TODO Auto-generated method stub
		if (this.getPosition().equalsIgnoreCase("developer")) {
			salary = 2000.0;
		} else if (this.getPosition().equalsIgnoreCase("testing")) {
			salary = 3000.0;
		}
		return salary;
	}
}

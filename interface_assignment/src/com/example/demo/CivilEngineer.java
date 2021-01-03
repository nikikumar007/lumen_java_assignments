package com.example.demo;

import com.example.demo.ifaces.Billable;

public class CivilEngineer implements Billable {
	private String position;

	public CivilEngineer(String position) {
		super();
		this.position = position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		double salary = 0;
		// TODO Auto-generated method stub
		if (this.getPosition().equalsIgnoreCase("builder")) {
			salary = 5000.0;
		} else if (this.getPosition().equalsIgnoreCase("designer")) {
			salary = 10000.0;
		}
		return salary;
	}

}

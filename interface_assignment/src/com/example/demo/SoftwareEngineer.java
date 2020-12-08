package com.example.demo;

import com.example.demo.ifaces.Billable;

public class SoftwareEngineer implements Billable {
	private int level;

	public SoftwareEngineer(int level) {
		super();
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public double calculate() {
		double salary = 0;
		// TODO Auto-generated method stub
		if (this.getLevel() == 1) {
			salary = 2000.0;
		} else if (this.getLevel() == 2) {
			salary = 3000.0;
		} else {
			salary = 50000;
		}
		return salary;
	}
}

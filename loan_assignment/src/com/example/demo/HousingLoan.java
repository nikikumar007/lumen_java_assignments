package com.example.demo;

public class HousingLoan extends Loan {

	private String propertyType;

	public HousingLoan() {
		super();
	}

	public HousingLoan(double loanAmt, int time, int cibilScore, String propertyType) {
		super(loanAmt, time, cibilScore);
		this.propertyType = propertyType;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public double getRate() {
		double rate = super.findRateOfInterest();
		return rate;
	}

	@Override
	public double findRateOfInterest() {
		double simpleInterest = (getLoanAmt() * getTime() * getRate()) / 100;
		return simpleInterest;
	}

}

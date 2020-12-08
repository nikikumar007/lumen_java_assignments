package com.example.demo;

public class Loan {
	private double loanAmt;
	private int time;
	private int cibilScore;

	public Loan() {
		super();
	}

	public Loan(double loanAmt, int time, int cibilScore) {
		super();
		this.loanAmt = loanAmt;
		this.time = time;
		this.cibilScore = cibilScore;
	}

	public double getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	public double findRateOfInterest() {
		double roi;
		if (this.cibilScore >= 500) {
			roi = 7.5;
		} else {
			roi = 8.2;
		}
		return roi;
	}

}

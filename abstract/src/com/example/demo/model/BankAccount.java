package com.example.demo.model;

public abstract class BankAccount {

	private long accountNumber;
	private String accountHolderName;
	private double currentBalance;

	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, String accountHolderName, double currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.currentBalance = currentBalance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public abstract double deposit(double amount);

	public abstract double withdraw(double amount);
}

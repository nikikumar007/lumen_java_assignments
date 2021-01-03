package com.demo.example;

public class RangeCheckException extends Exception {
	private String message;

	public RangeCheckException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

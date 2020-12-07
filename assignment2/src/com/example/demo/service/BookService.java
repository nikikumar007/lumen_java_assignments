package com.example.demo.service;

import com.example.demo.Book;

public class BookService {

	public double calculateDiscount(Book book1) {
		double discount = 0;
		if (book1.getPrice() > 4000) {
			discount = 1000;
		} else if (book1.getPrice() < 4000) {
			discount = 500;
		}
		return discount;

	}

	public double calculateDiscount(Book book1, String customerType) {
		double discount = 0;
		String type = customerType;
		if (type.equalsIgnoreCase("Corporate")) {
			discount = 500;
		} else if (type.equalsIgnoreCase("Retail")) {
			discount = 300;
		}
		return discount;

	}
}

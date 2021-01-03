package com.example.demo;

import com.example.demo.services.CreditCard;
import com.example.demo.services.UsingPredicate;

public class PredicateApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CreditCard card1=new CreditCard(1001, "Nikhil", 10000);
CreditCard card2 =new CreditCard(1001, "sam", 22000);
UsingPredicate.plainPredicate(card1);
UsingPredicate.plainPredicate(card2);
UsingPredicate.biFunction(card1);
UsingPredicate.usingSupplier(0);
	}

}

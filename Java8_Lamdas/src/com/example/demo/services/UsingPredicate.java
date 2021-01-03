package com.example.demo.services;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingPredicate {

	public static void plainPredicate(CreditCard card) {
		Predicate<CreditCard> checkLimit = ccard -> ccard.getCreditLimit() > 50000;
		System.out.println("Is Greater than 50000" + checkLimit.test(card));
	}

	// predicate with primitives
	public static void primitivePredicate(Double amount) {
		DoublePredicate checkLimit = cardLimit -> cardLimit > 50000;
		System.out.println("Is Greater than 50000" + checkLimit.test(amount));
	}

	// Bi Predicate- with two predicates
	public static void usingTwoArgsPredicate(CreditCard card, double expected) {
		// creating lambda
		BiPredicate<Double, Double> checkLimit = (limit, expt) -> limit > expt;
		System.out.println(checkLimit.test(card.getCreditLimit(), expected));
	}

	public static void biFunction(CreditCard card) {
		BiFunction<String, Double, String> check = (name, expect) -> {
			if (name.equalsIgnoreCase(card.getCardHolderName()) && expect == card.getCreditLimit()) {
				return "matched";
			} else
				return "Not matched";
		};
		System.out.println(check.apply("Nikhil", 10000.00));
	}

	public static void usingSupplier(int value) {
		Supplier<CreditCard> check = () -> {
			if (value == 0) {
				return new CreditCard();
			} else
				return new CreditCard(1001, "Niki", 5000);
		};
		System.out.println(check.get());

	}
}

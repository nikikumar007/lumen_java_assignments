package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.example.demo.services.CreditCard;

public class ApplicationMethodReference {
public static boolean check(CreditCard card)
{
	return card.getCardHolderName().length()>=6;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CreditCard card1=new CreditCard(1001, "Nikhil", 15000);
CreditCard card2=new CreditCard(1002, "Ram", 100000);
CreditCard card3=new CreditCard(1003, "Sham", 450000);
List<CreditCard> list=new ArrayList<CreditCard>();
list.add(card1);
list.add(card2);
list.add(card3);

list.forEach(element->System.out.println(element));
list.forEach(System.out::println);
Predicate<CreditCard> nameLength=ApplicationMethodReference::check;
System.out.println(nameLength.test(card1));
	}

}

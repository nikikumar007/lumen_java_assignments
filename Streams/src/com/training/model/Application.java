package com.training.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.training.services.CreditCardService;

public class Application {
	
	public static void print(List<CreditCard> list)
	{
		for(CreditCard eachCard:list)
			System.out.println(eachCard);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CreditCard card1=new CreditCard(1009, "Niki", 50000);
CreditCard card2=new CreditCard(1002, "Ram", 20000);
CreditCard card3=new CreditCard(1003, "Sham", 70000);
CreditCard card4=new CreditCard(1004, "Bham", 80000);
CreditCard card5=new CreditCard(1004, "Tom", 780000);
CreditCard card6=new CreditCard(1004, "Jerry", 980000);


CreditCardService service=new CreditCardService();
service.add(card1,card2,card3,card4,card5,card6);
List<CreditCard> list= service.findAll();
print(list);
	
System.out.println("Sorted By Name ");
	List<CreditCard> sortedByName = service.sortedList("cardHolderName");
	print(sortedByName);
	
	System.out.println("Sorted By Number ");
	List<CreditCard> sortedByNumber = service.sortedList("cardNumber");
	print(sortedByNumber);
	System.out.println("Top 3 Credit Limit ");
	List<CreditCard> limit = service.sortedList("sortByLimit");
	for(int i=0;i<3;i++)
	{
System.out.println(limit.get(i));
	}

	}
}

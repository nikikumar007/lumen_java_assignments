package com.training.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UsingSet {
public static void main(String args[])
{
	
	HashSet<Transaction> txn = new HashSet<>();
	txn.add(new Transaction(101, "Jio", 350));
	txn.add(new Transaction(102, "Airtel", 5350));
	System.out.println(txn);
	HashMap<String,CreditCard> cardList=new HashMap<>();
	CreditCard card1=new CreditCard(1001, "Sam", 15454);
	CreditCard card2=new CreditCard(1002, "Tam", 175454);
	CreditCard card3=new CreditCard(1003, "Wam", 165454);
	System.out.println(cardList.put(card1.getCardHolderName(), card1));
	System.out.println(cardList.put(card2.getCardHolderName(), card2));
	System.out.println(cardList.put(card3.getCardHolderName(), card3));

Set<Map.Entry<String,CreditCard >> setView=cardList.entrySet();
for(Map.Entry<String, CreditCard> eachEntry : setView)
{
	System.out.println(eachEntry.getKey());
	System.out.println(eachEntry.getValue());
}

List<String> names2=new ArrayList<>();
names2.add("Manish");
List<String> names=Arrays.asList("Ram","Sham","Bham");
System.out.println(names);
}
}

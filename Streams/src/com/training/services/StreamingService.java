package com.training.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.training.model.CreditCard;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Comparator;
public class StreamingService {
private List<CreditCard> cardList;
CreditCard card1=new CreditCard(1009, "Niki", 50000);
CreditCard card2=new CreditCard(1002, "Ram", 20000);
CreditCard card3=new CreditCard(1003, "Sham", 70000);
CreditCard card4=new CreditCard(1004, "Bham", 80000);
CreditCard card5=new CreditCard(1004, "Tom", 780000);
CreditCard card6=new CreditCard(1004, "Jerry", 980000);
public StreamingService()
{
	CreditCardService service=new CreditCardService();
	service.add(card6);
	cardList=service.findAll();
}
public List<CreditCard> useFilter(){
	return cardList.stream().
			filter(element->element.getCreditLimit()>50000).
			collect(toList());
}
public List<String> useFilterAndMap(){
	return cardList.stream().
			filter(element->element.getCreditLimit()>50000).
			map(element->element.getCardHolderName()).
			collect(toList());
}

	public Map<String,Double> useFilterTransformToMap() {
		return cardList.stream().
				filter(element->element.getCreditLimit()>50000).
				collect(toMap(CreditCard::getCardHolderName,CreditCard::getCreditLimit));
	}

	public List<CreditCard> sortedList(){
		return cardList.stream()
				.sorted(Comparator.comparing(CreditCard::getCardHolderName))
				.collect(toList());
	}
	
	public List<Number> findMaxCreditLimit()
	{
		Optional<Double> maxValue=cardList.stream()
				.map(element->element.getCreditLimit())
				.max(Double::compareTo);
		Optional<Double> minValue=cardList.stream()
				.map(element->element.getCreditLimit())
				.min(Double::compareTo);
		Long count=cardList.stream()
				.map(element->element.getCreditLimit())
				.count();
		double max=0.0;
		double min=0.0;
		
		if(maxValue.isPresent())
			{
			max= maxValue.get();
			}
		if(minValue.isPresent())
		{
		min= minValue.get();
		}
		List<Number> result=Arrays.asList(max,min,count);
		return result;
			}
			}



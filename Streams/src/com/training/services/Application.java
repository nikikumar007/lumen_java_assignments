package com.training.services;

import java.util.List;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StreamingService service=new StreamingService();
System.out.println("List of cardhlders name 50000");
service.useFilter().stream().forEach(System.out::println);
System.out.println("List of cardholdes name");
service.useFilter().stream().forEach(System.out::println);
Map<String, Double> list=service.useFilterTransformToMap();
System.out.println("Cardholder name and limit");
for(Map.Entry<String, Double> element:list.entrySet()) {
	System.out.println(element.getKey()+element.getValue());
	
	System.out.println("Sorted List");
	service.sortedList().forEach(System.out::println);
	
	List<Number> result=service.findMaxCreditLimit();
	System.out.println("Max:" +result.get(0));
	System.out.println("Min:" +result.get(1));
	System.out.println("Count:" +result.get(2));
	
	
}
	}

}

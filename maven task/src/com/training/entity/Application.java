package com.training.entity;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.Logger;

import com.google.gson.Gson;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=org.apache.log4j.Logger.getRootLogger();
Patient pat1=new Patient("Suhas", 22);
Patient pat2=new Patient("Sam", 52);
List<Patient> list=new ArrayList<>();
list.add(pat1);
list.add(pat2);
Doctor doc1=new Doctor(1001, "Ram", list);

try {
	if(list.size()<3)
	{
		throw new Exception("Size should be greayer than 3");
	}
	log.debug("normal completion");
} catch (Exception e) {
	// TODO: handle exception
	log.error("invalid size");
}
log.info("calling parser routines");




Gson parser=new Gson();
String jsonRep=parser.toJson(doc1);
System.out.println(jsonRep);
String patAsJason = "{'age':11,'name':'Ram'}";
Patient pat3=parser.fromJson(patAsJason, Patient.class);
System.out.println(pat3);
	}

}

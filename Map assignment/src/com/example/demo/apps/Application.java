package com.example.demo.apps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.demo.BloodDonor;


public class Application {
public static void main(String[] args)
{
	HashMap<String, List<BloodDonor>> bloodDonors =new HashMap<>();
	BloodDonor donor1=new BloodDonor(1, "Niki", 22, "apos");
	BloodDonor donor2=new BloodDonor(10, "Suhas", 22, "apos");
	BloodDonor donor3=new BloodDonor(101, "Sakshi", 22, "opos");
	List<BloodDonor> aposList=Arrays.asList(donor1,donor2);
	List<BloodDonor> oposList=Arrays.asList(donor3);
	bloodDonors.put("apos", aposList);
	bloodDonors.put("opos", oposList);
	
	Set<Map.Entry<String,List<BloodDonor> >> setView= bloodDonors.entrySet();
	for(Map.Entry<String, List<BloodDonor>> eachEntry : setView)
	{
		System.out.println(eachEntry.getKey());
		System.out.println(eachEntry.getValue());
	}
	
}
}

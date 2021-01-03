package com.training;

import java.util.Arrays;
import java.util.List;

public class Greeting
{
public String getMessage(){
return "Welcome to Java";
}
public List<String> getNames()
{
	List<String> nameList=Arrays.asList("Nik",null,"Ram",null);
	return nameList;
}
}
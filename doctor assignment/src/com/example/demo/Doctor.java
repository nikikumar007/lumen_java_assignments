package com.example.demo;

import java.util.List;

public class Doctor {
private String name;
private List<Patient> list;
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(String name, List<Patient> list) {
	super();
	this.name = name;
	this.list = list;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Patient> getList() {
	return list;
}
public void setList(List<Patient> list) {
	this.list = list;
}
@Override
public String toString() {
	return "Doctor [name=" + name + ", list=" + list + "]";
}


}

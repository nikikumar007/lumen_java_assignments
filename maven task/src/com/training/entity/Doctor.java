package com.training.entity;

import java.util.List;

public class Doctor {
	private int id;
private String doctorName;
private List<Patient> list;
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(int id,String name, List<Patient> list) {
	super();
	this.id=id;
	this.doctorName = name;
	this.list = list;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return doctorName;
}
public void setName(String name) {
	this.doctorName = name;
}
public List<Patient> getList() {
	return list;
}
public void setList(List<Patient> list) {
	this.list = list;
}
@Override
public String toString() {
	return "Doctor [name=" + doctorName + ", list=" + list + "]";
}


}

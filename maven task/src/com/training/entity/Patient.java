package com.training.entity;

public class Patient {
String name;
int age;
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Patient [name=" + name + ", age=" + age + "]";
}
}

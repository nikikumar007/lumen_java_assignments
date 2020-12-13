package com.exaxmple.demo.model;

public class Product {
private int id;
private String name;
private double ratePerUnit;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String name, double ratePerUnit) {
	super();
	this.id = id;
	this.name = name;
	this.ratePerUnit = ratePerUnit;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getRatePerUnit() {
	return ratePerUnit;
}
public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", ratePerUnit=" + ratePerUnit + "]";
}

}

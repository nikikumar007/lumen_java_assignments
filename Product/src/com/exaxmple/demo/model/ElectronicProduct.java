package com.exaxmple.demo.model;

public class ElectronicProduct extends Product {
private int warranty;

public ElectronicProduct() {
	super();
}

public ElectronicProduct(int id, String name, double ratePerUnit) {
	super(id, name, ratePerUnit);
}

public ElectronicProduct(int id, String name, double ratePerUnit, int warranty) {
	super(id, name, ratePerUnit);
	this.warranty = warranty;
}

public int getWarranty() {
	return warranty;
}

public void setWarranty(int warranty) {
	this.warranty = warranty;
}

@Override
public String toString() {
	return "ElectronicProduct [warranty=" + warranty + "]";
}



}

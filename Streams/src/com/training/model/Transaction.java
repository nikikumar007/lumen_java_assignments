package com.training.model;

public class Transaction {
private int id;
private String description;
private int amount;
public Transaction(int id, String description, int amount) {
	super();
	this.id = id;
	this.description = description;
	this.amount = amount;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Transaction [id=" + id + ", description=" + description + ", amount=" + amount + "]";
}

}

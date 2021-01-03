package com.training.model;

import java.util.Set;

public class CreditCard implements Comparable<CreditCard> {
private long cardNumber;
private String cardHolderName;
private double creditLimit;
private Set<Transaction> txns;
public CreditCard() {
	super();
}
public CreditCard(long cardNumber, String cardHolderName, double creditLimit) {
	super();
	this.cardNumber = cardNumber;
	this.cardHolderName = cardHolderName;
	this.creditLimit = creditLimit;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cardHolderName == null) ? 0 : cardHolderName.hashCode());
	result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
	long temp;
	temp = Double.doubleToLongBits(creditLimit);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CreditCard other = (CreditCard) obj;
	if (cardHolderName == null) {
		if (other.cardHolderName != null)
			return false;
	} else if (!cardHolderName.equals(other.cardHolderName))
		return false;
	if (cardNumber != other.cardNumber)
		return false;
	if (Double.doubleToLongBits(creditLimit) != Double.doubleToLongBits(other.creditLimit))
		return false;
	return true;
}
public long getCardNumber() {
	return cardNumber;
}
public void setCardNumber(long cardNumber) {
	this.cardNumber = cardNumber;
}
public String getCardHolderName() {
	return cardHolderName;
}
public void setCardHolderName(String cardHolderName) {
	this.cardHolderName = cardHolderName;
}
public double getCreditLimit() {
	return creditLimit;
}
public void setCreditLimit(double creditLimit) {
	this.creditLimit = creditLimit;
}
@Override
public String toString() {
	return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", creditLimit="
			+ creditLimit + "]";
}
@Override
public int compareTo(CreditCard otherObject) {
	return this.cardHolderName.compareTo(otherObject.cardHolderName);
}

}

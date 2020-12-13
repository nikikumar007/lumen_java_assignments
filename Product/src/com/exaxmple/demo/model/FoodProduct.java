package com.exaxmple.demo.model;

public class FoodProduct extends Product{
	private String shelfLife;

	public FoodProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodProduct(int id, String name, double ratePerUnit) {
		super(id, name, ratePerUnit);
	}

	public FoodProduct(int id, String name, double ratePerUnit, String shelfLife) {
		super(id, name, ratePerUnit);
		this.shelfLife = shelfLife;
	}

	public String getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}

	@Override
	public String toString() {
		return "FoodProduct [shelfLife=" + shelfLife + "]";
	}
	

}

package com.example.demo;

public class Student {
	private String name;
	private int mark;
	private int rollnum;
	
	public Student() {
		super();
	}
	public Student(String name, int mark, int rollnum) {
		super();
		this.name = name;
		this.mark = mark;
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  this.name +':'+this.mark+':'+this.rollnum;
	}
	
	
	
}

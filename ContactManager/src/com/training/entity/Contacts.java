package com.training.entity;
import java.time.LocalDate;

public class Contacts {
	private int id;
	private String name;
	private String address;
	private long mobileNumber;
	private String img;
	private LocalDate dateOfBirth;
	private String email;
	private String group;

	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacts(int id,String name, String address, long mobileNumber, String img, LocalDate dateOfBirth, String email, String group) {
		super();
		this.id=id;
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.img = img;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.group = createGroup(group);
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setGroup(String group) {
		this.group = createGroup(group) ;
	}
	public String getGroup() {
		return group;
	}
	
	public static String createGroup(String group) {
		if(group.equalsIgnoreCase("relatives")) {
			return "relatives";
		}
		else if(group.equalsIgnoreCase("personal")){
			return "personal";
		}
		else if(group.equalsIgnoreCase("professional")) {
			return "professional";
		}
		return "";
	}
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber + ", img=" + img
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + "]";
	}

}

